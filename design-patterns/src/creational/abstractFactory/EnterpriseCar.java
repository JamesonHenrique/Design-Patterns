package creational.abstractFactory;

public class EnterpriseCar implements Vehicle{
    private String name;
    private final Customer customer;

    public EnterpriseCar(String name, Customer customer) {
        this.name = name;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void pickUp() {
        System.out.println("Carro " + name + " está buscando " + customer.getName());
    }
}
