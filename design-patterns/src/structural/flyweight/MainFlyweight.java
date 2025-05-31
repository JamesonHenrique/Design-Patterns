package structural.flyweight;

import static structural.flyweight.DeliveryContext.deliveryContext;

public class MainFlyweight {
    public static void main(String[] args) {
        DeliveryFactory factory = new DeliveryFactory();
       deliveryContext(
                factory,
                "Luiz",
                404,
                new DeliveryLocationData(
                        "Rua A"
                        , "São Paulo")
        );
        deliveryContext(
                factory,
                "Helena",
                401,
                new DeliveryLocationData(
                        "Rua A"
                        , "São Paulo")
        );
        deliveryContext(
                factory,
                "Fernando",
                400,
                new DeliveryLocationData(
                        "Rua B"
                        , "São Paulo")
        );
        System.out.println(factory.getLocations());
    }
}
