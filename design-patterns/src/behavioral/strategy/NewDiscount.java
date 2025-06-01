package behavioral.strategy;

public class NewDiscount extends DiscountStrategy {
    @Override
    public double getDiscount(ShoppingCart cart) {
        double total = cart.getTotal();
        double discount = 0.0;
        if (total >= 100) {
            discount = 10.0;
        }
        return total - (total * discount / 100);
    }
}