package creational.abstractFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        IndividualCustomerVehicleFactory individualFactory = new IndividualCustomerVehicleFactory();
        EnterpriseCustomerVehicleFactory enterpriseFactory = new EnterpriseCustomerVehicleFactory();
        Vehicle enterpriseCar = enterpriseFactory.createVehicle("Fusca", "João");
        Vehicle individualCar = individualFactory.createVehicle("Celta", "Maria");
        enterpriseCar.pickUp();
        individualCar.pickUp();


    }
}
