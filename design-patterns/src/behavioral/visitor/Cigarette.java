package behavioral.visitor;

public class Cigarette extends VisitableProduct{
    protected double price;

    public Cigarette(double price) {
        super("Cigarette", price);
    }

    @Override
    public double getPriceWithTaxes(TaxVisitorProtocol taxVisitor) {
        return taxVisitor.calculateTaxesForCigarette(this);
    }
}
