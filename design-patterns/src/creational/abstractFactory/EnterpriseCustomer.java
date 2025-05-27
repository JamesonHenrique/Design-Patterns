package creational.abstractFactory;

public class EnterpriseCustomer implements Customer{
    private final String name;

    public EnterpriseCustomer(String name) {
        this.name = name + " (Enterprise)";
    }

    @Override
    public String getName() {
        return name;
    }
}
