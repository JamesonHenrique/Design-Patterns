package creational.factoryMethod;

public class CarFactory extends VehicleFactory{
    @Override
    Car getVehicle(String vehicleName) {
        return new Car(vehicleName);
    }
}
