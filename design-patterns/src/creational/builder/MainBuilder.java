package creational.builder;

import structural.facade.BuilderFacade;

public class MainBuilder {
    public static void main(String[] args) {
     BuilderFacade builderFacade = new BuilderFacade();
     builderFacade.makeMeal1();
     builderFacade.makeMeal2();
     builderFacade.makeMeal3();
    }
}
