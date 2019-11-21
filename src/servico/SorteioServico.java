package servico;

import dominio.Caixa;
import dominio.Pessoa;
import exception.UltimaPessoaPegaraElaMesma;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SorteioServico {

    private List<Pessoa> pessoas;
    private String tituloDoSorteio;
    private Caixa caixa;
    private Boolean sorteioRealizadoComSucesso = Boolean.FALSE;

    public SorteioServico(List<Pessoa> pessoas, String tituloDoSorteio) {
        this.pessoas = pessoas;
        this.tituloDoSorteio = tituloDoSorteio;
    }

    public void sortear() {
        try {
            System.out.println("Iniciando sorteio");

            while (!sorteioRealizadoComSucesso) {
                inicializarSorteio();
                for (Pessoa pessoa : pessoas) {
                    try {
                        pessoa.pegarAmigo(caixa);
                    } catch (UltimaPessoaPegaraElaMesma e) {
                        sorteioRealizadoComSucesso = Boolean.FALSE;
                        break;
                    }
                }
            }

            salvarAmigosEmArquivos();
            enviarEmails();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void inicializarSorteio() {
        sorteioRealizadoComSucesso = Boolean.TRUE;
        for (Pessoa pessoa : pessoas) {
            pessoa.removerAmigo();
        }
        this.caixa = new Caixa(new ArrayList<>(pessoas));
    }

    private void salvarAmigosEmArquivos() throws Exception {
        System.out.println("Criando arquivos...");

        for (Pessoa pessoa : pessoas) {
            Path path = Paths.get("C:/Amigo_Secreto/Amigo_Secreto_de_" + pessoa.getNome() + ".txt");
            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                writer.write("Olá " + pessoa.getNome() + "!\n\n" + "Seu amigo secreto é " + pessoa.getAmigo());
            }
        }

        System.out.println("Criando arquivos criados!");
    }

    private void enviarEmails() {
        for (Pessoa pessoa : pessoas) {
            EmailServico emailServico = new EmailServico();
            emailServico.enviarEmailDeAmigoSecreto(pessoa, tituloDoSorteio);
        }
    }
}
