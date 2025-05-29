package structural.facade;

import creational.builder.PrincipalDishBuilder;
import creational.builder.VeganDishBuilder;

public class BuilderFacade {
    private final PrincipalDishBuilder principalDishBuilder = new PrincipalDishBuilder();
    private final VeganDishBuilder veganDishBuilder = new VeganDishBuilder();

    public void makeMeal1() {
        principalDishBuilder.makeMeal();
        System.out.println("Prato Principal -> "+principalDishBuilder.getPrice());
    }

    public void makeMeal2() {
        veganDishBuilder.makeMeal();
        System.out.println("Prato Vegano -> "+veganDishBuilder.getPrice());
    }
    public void makeMeal3() {
        principalDishBuilder.reset();
        principalDishBuilder.makeBeverage();
        System.out.println("Bebida -> "+principalDishBuilder.getPrice());
    }
}
