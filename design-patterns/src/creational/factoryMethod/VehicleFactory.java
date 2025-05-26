package creational.factoryMethod;

public abstract class VehicleFactory {
    abstract Vehicle getVehicle(String vehicleName);
    Vehicle pickUp(String customerName, String vehicleName) {
        Vehicle vehicle = getVehicle(vehicleName);
        vehicle.pickUp(customerName);
        return vehicle;
    }
}
