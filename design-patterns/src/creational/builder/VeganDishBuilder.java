package creational.builder;

public class VeganDishBuilder implements MealBuilderProtocol {
    private final MealBox meal = new MealBox();

    @Override
    public MealBuilderProtocol makeMeal() {
        Rice rice = new Rice("Arroz", 5);
        Beans beans = new Beans("Feijão", 10);
        meal.add(rice, beans);
        return this;
    }

    public MealBuilderProtocol reset() {
        meal.getChildren().clear();
        return this;
    }

    public MealBox getMeal() {
        return meal;
    }

    public double getPrice() {
        return meal.getPrice();
    }
}
