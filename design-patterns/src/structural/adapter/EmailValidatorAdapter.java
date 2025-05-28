package structural.adapter;

import static structural.adapter.EmailValidator.isValidEmail;

public class EmailValidatorAdapter implements EmailValidatorProtocol{
    @Override
    public boolean isEmail(String value) {
        return isValidEmail(value);
    }

}
