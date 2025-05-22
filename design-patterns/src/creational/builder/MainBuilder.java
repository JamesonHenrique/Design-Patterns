package creational.builder;

public class MainBuilder {
    public static void main(String[] args) {
     PrincipalDishBuilder principalDishBuilder = new PrincipalDishBuilder();
     principalDishBuilder.makeMeal();
     System.out.println(principalDishBuilder.getPrice());
     principalDishBuilder.reset();
     principalDishBuilder.makeBeverage();
     System.out.println(principalDishBuilder.getPrice());
     System.out.println("---------------------------------");
     VeganDishBuilder veganDishBuilder = new VeganDishBuilder();
     veganDishBuilder.makeMeal();
     System.out.println(veganDishBuilder.getPrice());
    }
}
