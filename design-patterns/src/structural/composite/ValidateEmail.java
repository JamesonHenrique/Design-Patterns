package structural.composite;

import java.util.regex.Pattern;

public class ValidateEmail extends ValidationComponent {
    @Override
    boolean validate(Object value) {
        if (!(value instanceof String)) {
            return false;
        }
        return Pattern.compile("@").matcher((String) value).find();
    }
}
