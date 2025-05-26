package creational.factoryMethod;

public class Car implements Vehicle{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void pickUp(String customerName) {
        System.out.println("Carro " + name + " está buscando " + customerName);
    }

    @Override
    public void stop() {
        System.out.println("Carro " + name + " parou");
    }
}
