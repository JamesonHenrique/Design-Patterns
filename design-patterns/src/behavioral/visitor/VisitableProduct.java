package behavioral.visitor;

public abstract class VisitableProduct {
    protected String name;
    protected double price;

    public VisitableProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public abstract double getPriceWithTaxes(TaxVisitorProtocol taxVisitor);
    @Override
    public String toString() {
        return "VisitableProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
