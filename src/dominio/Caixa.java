package dominio;

import exception.CaixaVaziaException;
import exception.UltimaPessoaPegaraElaMesma;

import java.util.List;
import java.util.Random;

public class Caixa {

    private List<Pessoa> pessoas;

    public Caixa(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public String pegarAmigo(Pessoa pessoa) throws Exception {
        if (pessoas.isEmpty()) {
            throw new CaixaVaziaException("A caixa está vazia");
        }

        if (ultimaPessoaPegaraElaMesma(pessoa)) {
            throw new UltimaPessoaPegaraElaMesma("A última pessoa pegará ela mesma");
        }

        int index = new Random().nextInt(pessoas.size());
        Pessoa pessoaSorteada = pessoas.get(index);
        while (pessoaSorteada.equals(pessoa)) {
            index = new Random().nextInt(pessoas.size());
            pessoaSorteada = pessoas.get(index);
        }

        pessoas.remove(index);

        return pessoaSorteada.getNome();
    }

    private boolean ultimaPessoaPegaraElaMesma(Pessoa pessoa) {
        return pessoas.stream().allMatch(pessoa::equals);
    }
}
