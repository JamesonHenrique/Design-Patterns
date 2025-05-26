package creational.factoryMethod;

public class Bicycle implements Vehicle{
    private String name;

    public Bicycle(String name) {
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
                System.out.println("Bicicleta " + name + " está buscando " + customerName);
    }

    @Override
    public void stop() {
        System.out.println("Bicicleta " + name + " parou");
    }
}

