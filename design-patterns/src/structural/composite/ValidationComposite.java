package structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidationComposite extends ValidationComponent{
    private final List<ValidationComponent> children = new ArrayList<>();

    public List<ValidationComponent> getChildren() {
        return children;
    }

    @Override
    boolean validate(Object value) {
        for(ValidationComponent child : children) {
            boolean validation = child.validate(value);
            if(!validation) {
                return false;
            }
        }
        return true;
    }

    void add(ValidationComponent... validationComponents) {
        children.addAll(Arrays.asList(validationComponents));
    }
}
