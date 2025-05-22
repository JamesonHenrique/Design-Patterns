package creational.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MealBox implements MealCompositeProtocol{
    private final List<MealCompositeProtocol> children = new ArrayList<>();

    @Override
    public double getPrice() {
        return children
                .stream()
                .mapToDouble(MealCompositeProtocol::getPrice)
                .sum();
    }
    void add(MealCompositeProtocol... meal) {
        Collections.addAll(children, meal);
    }
}
