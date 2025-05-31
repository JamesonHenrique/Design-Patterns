package structural.flyweight;

import java.util.Map;

public class DeliveryContext {
    public static void deliveryContext(DeliveryFactory factory, String name, int number, DeliveryLocationData data) {
        DeliveryLocation location = factory.makeLocation(data);
        location.deliver(name, number);
    }
}
