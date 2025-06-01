package behavioral.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    private final List<ProductProtocol[]> products = new ArrayList<>();
    private DiscountStrategy discountStrategy = new DefaultDiscount();

    void addProduct(ProductProtocol... product) {
        products.add(product);
    }

    List<ProductProtocol[]> getProducts() {
        return products;
    }

    double getTotal() {
        return products.stream()
                .flatMap(Arrays::stream)
                .mapToDouble(ProductProtocol::getPrice)
                .sum();
    }
    double getTotalWithDiscount() {
        return discountStrategy.getDiscount(this);
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
