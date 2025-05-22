package creational.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Rice rice = new Rice("Arroz", 5);
        Beans beans = new Beans("Feijão", 10);
        Meat meat = new Meat("Carne", 20);
        MealBox mealBox = new MealBox();
        mealBox.add(rice, beans, meat);
        System.out.println("Total: " + mealBox.getPrice());
    }
}
