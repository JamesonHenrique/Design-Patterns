package behavioral.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setDiscountStrategy(new NewDiscount());
        shoppingCart.addProduct(new Product("Laptop", 1500.00),
                                new Product("Smartphone", 800.00),
                                new Product("Headphones", 200.00));

        System.out.println("Total: " + shoppingCart.getTotal());
        System.out.println("Total com desconto: " + shoppingCart.getTotalWithDiscount());


    }
}
