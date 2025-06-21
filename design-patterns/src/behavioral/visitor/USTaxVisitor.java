package behavioral.visitor;

public class USTaxVisitor implements TaxVisitorProtocol{
    @Override
    public double calculateTaxesForFood(Food food) {
        return food.getPrice() * 2.10;
    }
    @Override
    public double calculateTaxesForAlcoholicDrink(AlcoholicDrink alcoholicDrink) {
        return alcoholicDrink.getPrice() * 2.5;
    }

    @Override
    public double calculateTaxesForCigarette(Cigarette cigarette) {
        return cigarette.getPrice() * 3.5;
    }
}
