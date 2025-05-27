package creational.abstractFactory;

public class EnterpriseCustomerVehicleFactory implements CustomerVehicleFactory{
    @Override
    public Customer createCustomer(String customerName) {
        return new EnterpriseCustomer(customerName);
    }

    @Override
    public Vehicle createVehicle(String vehicleName, String customerName) {
        Customer customer = createCustomer(customerName);
        return new EnterpriseCar(vehicleName, customer);
    }
}
