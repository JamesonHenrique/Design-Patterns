package creational.factoryMethod;

public class MainFactory {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car fusca = carFactory.getVehicle("Fusca");

        fusca.pickUp("João");
        fusca.stop();

        BicycleFactory bicycleFactory = new BicycleFactory();
        Bicycle bicycle = bicycleFactory.getVehicle("Mountain Bike");

        bicycle.pickUp("Maria");
        bicycle.stop();
    }
}
