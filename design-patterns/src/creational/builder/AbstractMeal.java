package creational.builder;

public abstract class AbstractMeal implements  MealCompositeProtocol{
    private final double price;

    public AbstractMeal(String name, double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
