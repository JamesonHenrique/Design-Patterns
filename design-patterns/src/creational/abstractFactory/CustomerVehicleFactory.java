package creational.abstractFactory;

public interface CustomerVehicleFactory {
    Customer createCustomer(String customerName);
    Vehicle createVehicle(String vehicleName, String customerName);
}
