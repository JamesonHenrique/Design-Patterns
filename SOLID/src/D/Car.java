package D;

/**
 * Interface que representa um motor.
 * Segue o Princípio da Inversão de Dependência (DIP), pois abstrai o comportamento
 * do motor, permitindo que diferentes implementações sejam usadas sem alterar
 * as classes que dependem dela.
 */
public class Car {
    private IEngine engine;

    public Car(IEngine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started");
    }
}
