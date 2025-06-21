package behavioral.visitor;

public class AlcoholicDrink extends VisitableProduct{
    protected double price;

    public AlcoholicDrink(double price) {
        super("AlcoholicDrink", price);
    }

    @Override
    public double getPriceWithTaxes(TaxVisitorProtocol taxVisitor) {
        return taxVisitor.calculateTaxesForAlcoholicDrink(this);
    }
}
