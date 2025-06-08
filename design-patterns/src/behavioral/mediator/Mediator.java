package behavioral.mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mediator {
    private List<Seller> sellers = new ArrayList<>();

    public void addSeller(Seller... seller) {
        sellers.addAll(Arrays.asList(seller));
        sellers.forEach(s -> s.setMediator(this));
    }

    public List<Seller> getSellers() {
        return sellers;
    }

    public SellerProduct buy(String id) {
        for (Seller seller : sellers) {
            SellerProduct product = seller.sell(id);
            if (product != null) {
                System.out.println("Produto comprado: " + product.getId() + " - " + product.getName() + " - R$" + product.getPrice());
                return product;
            }
        }
        System.out.println("Produto não encontrado: " + id);
        return null;
    }

    public void showProducts() {
        System.out.println("Lista de produtos disponíveis:");
        for (Seller seller : sellers) {
            seller.showProducts();
        }
    }
}
