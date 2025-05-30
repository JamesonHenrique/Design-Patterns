package structural.flyweight;


public class DeliveryLocationData {
    private final String street;
    private final String city;

    public DeliveryLocationData(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}