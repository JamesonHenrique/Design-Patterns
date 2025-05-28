package structural.composite;

import java.util.regex.Pattern;

public class ValidateNumber extends ValidationComponent{
    public boolean validate(Object value) {
        if (!(value instanceof String)) {
            return false;
        }
        return Pattern.compile("\\d+").matcher((String) value).find();
    }
}
