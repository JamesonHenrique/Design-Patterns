package creational.builder;

public class PrincipalDishBuilder implements MealBuilderProtocol {
    private final MealBox meal = new MealBox();

    @Override
    public MealBuilderProtocol makeMeal() {
        Rice rice = new Rice("Arroz", 5);
        Beans beans = new Beans("Feijão", 10);
        Meat meat = new Meat("Carne", 20);
        meal.add(rice, beans, meat);
        return this;
    }

    public MealBuilderProtocol makeBeverage() {
        Beverage beverage = new Beverage("Bebida", 7);
        meal.add(beverage);
        return this;
    }

    public MealBuilderProtocol makeDessert() {
        Dessert dessert = new Dessert("Sobremesa", 10);
        meal.add(dessert);
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
