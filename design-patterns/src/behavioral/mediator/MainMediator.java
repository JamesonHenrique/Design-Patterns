package behavioral.mediator;

import java.math.BigDecimal;
import java.util.UUID;

public class MainMediator {
    public static void main(String[] args) {
        Seller seller1 = new Seller();
        Seller seller2 = new Seller();
        Mediator mediator = new Mediator();
        seller1.setMediator(mediator);
        seller2.setMediator(mediator);

        SellerProduct product1 = new SellerProduct(UUID.randomUUID().toString(), "Produto A", BigDecimal.valueOf(100.0));
        SellerProduct product2 = new SellerProduct(UUID.randomUUID().toString(), "Produto B", BigDecimal.valueOf(200.0));
        SellerProduct product3 = new SellerProduct(UUID.randomUUID().toString(), "Produto C", BigDecimal.valueOf(300.0));

        seller1.addProduct(product1);
        seller2.addProduct(product2, product3);

        mediator.addSeller(seller1, seller2);

        Buyer buyer = new Buyer(mediator);

        buyer.viewProducts();

        buyer.buy(product1.getId());
        buyer.buy(product2.getId());

        buyer.viewProducts();
    }
}
