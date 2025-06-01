package behavioral.strategy;

public class Product implements ProductProtocol{
    private final String name;
    private final double price;

    public Product(String name,double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
