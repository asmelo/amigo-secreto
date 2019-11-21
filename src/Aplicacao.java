import dominio.Pessoa;
import servico.SorteioServico;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        Pessoa Alexandre = new Pessoa("Alexandre", "asmelo10@hotmail.com");
        Pessoa Aninha = new Pessoa("Aninha", "asmelo10@hotmail.com");

        List<Pessoa> participantes = new ArrayList<>();
        participantes.add(Alexandre);
        participantes.add(Aninha);

        SorteioServico sorteioServico = new SorteioServico(participantes, "Amigo Secreto - Velha Infância");

        sorteioServico.sortear();
    }

}
