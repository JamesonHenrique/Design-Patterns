package structural.proxy;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface SystemUserProtocol {
    String getFirstName();
    String getUserName();
    CompletableFuture<List<SystemUserAddress>> getAddresses();
}
