package creational.factoryMethod;

public class BicycleFactory extends VehicleFactory{
    @Override
    Bicycle getVehicle(String vehicleName) {
        return new Bicycle(vehicleName);
    }
}
