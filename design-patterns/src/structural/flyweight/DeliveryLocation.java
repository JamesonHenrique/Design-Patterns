package structural.flyweight;

public class DeliveryLocation implements DeliveryFlyweight{
    private final DeliveryLocationData intrinsicState;

    public DeliveryLocation(DeliveryLocationData intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void deliver(String name, int number) {
        System.out.println("Entrega para " + name + " na localização: " + intrinsicState.getStreet() + " - " + intrinsicState.getCity() + ", número: " + number);
    }


}
