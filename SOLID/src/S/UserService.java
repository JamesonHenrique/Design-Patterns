package S;
/**
 * Gerencia operações relacionadas a usuários, como registro.
 * Delegando a funcionalidade de envio de e-mails para a classe EmailSender,
 * esta classe segue o Princípio da Responsabilidade Única (SRP).
 */
public class UserService {
    public void register(User user) {
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(user.getEmail(), "Welcome " + user.getName());
    }

}
