package behavioral.mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seller {
    private List<SellerProduct> products = new ArrayList<>();
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void showProducts() {
        if (products.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("Produtos do vendedor:");
        for (SellerProduct product : products) {
            System.out.println(product.getId() + " - " + product.getName() + " - R$" + product.getPrice());
        }
    }

    public void addProduct(SellerProduct... product) {
        products.addAll(Arrays.asList(product));
    }

    public synchronized SellerProduct sell(String id) {
        for (SellerProduct product : products) {
            if (product.getId().equals(id)) {
                products.remove(product);
                System.out.println("Produto vendido: " + product.getName());
                return product;
            }
            System.out.println("Produto não encontrado: " + id);

        }

        return null;
    }
}

