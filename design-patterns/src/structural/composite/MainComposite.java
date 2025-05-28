package structural.composite;

public class MainComposite {
    public static void main(String[] args) {
        ValidateEmail validateEmail = new ValidateEmail();
        ValidateNumber validateNumber = new ValidateNumber();
        ValidateString validateString = new ValidateString();
        ValidationComposite validationComposite = new ValidationComposite();
        validationComposite.add(validateEmail, validateNumber, validateString);
        System.out.println(validationComposite.validate("joao1@email.com"));
    }
}
