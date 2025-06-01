package behavioral.strategy;

public class DefaultDiscount extends DiscountStrategy {
    @Override
    public double getDiscount(ShoppingCart cart) {
        double total = cart.getTotal();
        double discount = 0.0;
        if (total >= 100 && total <= 200) {
            discount = 10.0;
        } else if (total > 200 && total <= 300) {
            discount = 20.0;
        } else if (total > 300) {
            discount = 30.0;
        }
        return total - (total * discount / 100);
    }
}