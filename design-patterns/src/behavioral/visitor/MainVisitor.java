package behavioral.visitor;

import java.util.List;

public class MainVisitor {
    public static void main(String[] args) {
        VisitableProduct food = new Food(10.0);
        VisitableProduct drink = new AlcoholicDrink(5.0);
        VisitableProduct cigarette = new Cigarette(5.0);

        List<VisitableProduct> cart = List.of(food, drink, cigarette);
        double total = cart.stream().mapToDouble(
                VisitableProduct::getPrice
        ).sum();

        TaxVisitorProtocol taxVisitorFromBrazil = new BrazilTaxVisitor();
        double totalWithTaxes = cart.stream().mapToDouble(
            item -> item.getPriceWithTaxes(taxVisitorFromBrazil)
        ).sum();

        TaxVisitorProtocol taxVisitorFromUS = new USTaxVisitor();
        double totalWithTaxesUS = cart.stream().mapToDouble(
                item -> item.getPriceWithTaxes(taxVisitorFromUS)
        ).sum();

        System.out.println("Total price of cart: " + total);
        System.out.println("Total price of cart with taxes's Brazil: " + totalWithTaxes);
        System.out.println("Total price of cart with taxes's US: " + totalWithTaxesUS);
    }
}
