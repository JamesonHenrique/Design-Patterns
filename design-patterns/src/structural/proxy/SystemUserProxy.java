package structural.proxy;

import java.util.List;
import java.util.concurrent.CompletableFuture;


public class SystemUserProxy implements SystemUserProtocol{

    private SystemUserProtocol realUser = null;
    private final String firstName;
    private final String userName;

    private List<SystemUserAddress> realUserAddresses = null;

    public SystemUserProxy(String firstName, String userName) {
        this.firstName = firstName;
        this.userName = userName;
    }

    private SystemUserProtocol createUser() {
        if (realUser == null) {
            realUser = new AdminUser(firstName, userName);
        }
        return realUser;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public CompletableFuture<List<SystemUserAddress>> getAddresses() {
        if (realUserAddresses != null) {
            return CompletableFuture.completedFuture(realUserAddresses);
        }
        this.realUser = createUser();
        return this.realUser.getAddresses().thenApply(addresses -> {
            this.realUserAddresses = addresses;
            return addresses;
        });
    }

    public List<SystemUserAddress> getRealUserAddresses() {
        return realUserAddresses;
    }

    public void setRealUserAddresses(List<SystemUserAddress> realUserAddresses) {
        this.realUserAddresses = realUserAddresses;
    }
}
