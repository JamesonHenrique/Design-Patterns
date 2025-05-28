package structural.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        EmailValidatorAdapter emailValidatorAdapter = new EmailValidatorAdapter();
        String email = "exemplo@email.com";
        System.out.println(emailValidatorAdapter.isEmail(email) ? "O email é valido." : "O email é invalido.");
    }
}
