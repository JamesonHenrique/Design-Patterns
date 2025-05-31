package structural.proxy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AdminUser implements SystemUserProtocol{
    private final String firstName;
    private final String userName;

    public AdminUser(String firstName, String userName) {
        this.firstName = firstName;
        this.userName = userName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public CompletableFuture<List<SystemUserAddress>> getAddresses() {
        CompletableFuture<List<SystemUserAddress>> future = new CompletableFuture<>();

        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.schedule(() -> {
            List<SystemUserAddress> addresses = Arrays.asList(
                    new SystemUserAddress("Av. Brasil", 50),
                    new SystemUserAddress("Rua A.", 50)
            );
            future.complete(addresses);
            scheduler.shutdown();
        }, 2, TimeUnit.SECONDS);

        return future;
    }
}
