package dominio;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private String email;
    private String amigo;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getAmigo() {
        return amigo;
    }

    public void removerAmigo() {
        this.amigo = null;
    }

    public void pegarAmigo(Caixa caixa) throws Exception {
        this.amigo = caixa.pegarAmigo(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome) &&
                email.equals(pessoa.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
