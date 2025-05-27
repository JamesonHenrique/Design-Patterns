package creational.abstractFactory;

public class IndividualCustomerVehicleFactory implements CustomerVehicleFactory{
    @Override
    public Customer createCustomer(String customerName) {
        return new IndividualCustomer(customerName);
    }

    @Override
    public Vehicle createVehicle(String vehicleName, String customerName) {
        Customer customer = createCustomer(customerName);
        return new IndividualCar(vehicleName,customer);
    }
}
