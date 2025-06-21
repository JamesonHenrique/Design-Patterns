package behavioral.visitor;

public class BrazilTaxVisitor implements TaxVisitorProtocol{
    @Override
    public double calculateTaxesForFood(Food food) {
        return food.getPrice() * 1.10;
    }
    @Override
    public double calculateTaxesForAlcoholicDrink(AlcoholicDrink alcoholicDrink) {
        return alcoholicDrink.getPrice() * 1.5;
    }

    @Override
    public double calculateTaxesForCigarette(Cigarette cigarette) {
        return cigarette.getPrice() * 2.5;
    }
}
