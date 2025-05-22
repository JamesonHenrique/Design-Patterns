package S;
/**
 * Responsável por enviar e-mails.
 * Esta classe segue o Princípio da Responsabilidade Única (SRP),
 * pois sua única função é lidar com o envio de e-mails.
 */
public class EmailSender {

    public void sendEmail(String email, String message) {

        System.out.println("Sending email to " + email + ": " + message);

    }

}
