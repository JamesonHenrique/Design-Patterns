package behavioral.visitor;

public class Food extends VisitableProduct{
    protected double price;

    public Food(double price) {
        super("Food", price);

    }

    @Override
    public double getPriceWithTaxes(TaxVisitorProtocol taxVisitor) {
        return taxVisitor.calculateTaxesForFood(this);
    }
}
