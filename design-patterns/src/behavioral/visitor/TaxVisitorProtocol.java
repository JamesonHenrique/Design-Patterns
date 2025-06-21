package behavioral.visitor;

public interface TaxVisitorProtocol {
    double calculateTaxesForFood(Food food);
    double calculateTaxesForAlcoholicDrink(AlcoholicDrink alcoholicDrink);
    double calculateTaxesForCigarette(Cigarette cigarette);

}
