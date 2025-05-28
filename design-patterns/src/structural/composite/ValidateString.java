package structural.composite;

public class ValidateString extends ValidationComponent {
    @Override
    boolean validate(Object value) {
        return value instanceof String;
    }
}
