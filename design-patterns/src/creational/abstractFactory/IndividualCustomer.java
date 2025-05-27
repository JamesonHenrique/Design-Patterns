package creational.abstractFactory;

public class IndividualCustomer implements Customer{
    private final String name;

    public IndividualCustomer(String name) {
        this.name = name + " (Individual)";
    }

    @Override
    public String getName() {
        return name;
    }
}
