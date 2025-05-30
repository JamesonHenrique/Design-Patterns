package structural.proxy;

public class SystemUserAddress {
    private String street;
    private int number;

    public SystemUserAddress(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
