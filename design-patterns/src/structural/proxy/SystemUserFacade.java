package structural.proxy;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SystemUserFacade {
    private final SystemUserProtocol user;

    public SystemUserFacade(String firstName, String userName) {
        this.user = new SystemUserProxy(firstName, userName);
    }

    public void fetchAndPrintAddresses() {
        CompletableFuture<List<SystemUserAddress>> futureAddresses = user.getAddresses();
        futureAddresses.thenAccept(addresses -> {
            System.out.println("Endereços recebidos:");
            for (SystemUserAddress address : addresses) {
                System.out.println(address.getStreet() + ", " + address.getNumber());
            }
        }).join();
    }
}
