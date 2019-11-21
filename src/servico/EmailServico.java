package servico;

import dominio.Pessoa;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailServico {

    private static final String EMAIL_REMETENTE = "<infome_seu_email_do_gmail>";
    /*
     Usar a "senhas de app" do google
     https://support.google.com/accounts/answer/185833?p=InvalidSecondFactor&visit_id=637099035948938039-1463930191&rd=1
     */
    private static final String SENHA_EMAIL_REMETENTE = "<informe_sua_senha_de_app_do_gmail>";
    private Session session;

    public EmailServico() {

        Properties props = new Properties();
        /** Parâmetros de conexão com servidor Gmail */
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        this.session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication(EMAIL_REMETENTE, SENHA_EMAIL_REMETENTE);
                    }
                });
    }

    public void enviarEmailDeAmigoSecreto(Pessoa pessoa, String tituloDoSorteio) {
        try {

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(EMAIL_REMETENTE));//Remetente

            Address[] toUser = InternetAddress.parse(pessoa.getEmail()); //Destinatário(s)

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject(tituloDoSorteio);//Assunto
            EmailLayoutServico emailLayoutServico = new EmailLayoutServico();
            message.setContent(emailLayoutServico.getBody(pessoa, tituloDoSorteio), "text/html; charset=utf-8");

            /*Método para enviar a mensagem criada*/
            Transport.send(message);

            System.out.println("Email enviado com sucesso para " + pessoa.getNome());

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
