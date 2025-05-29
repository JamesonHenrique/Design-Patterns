package structural.decoractor;

public class Camiseta implements ProductProtocol{

    @Override
    public String getName() {
        return "Camiseta";
    }

    @Override
    public double getPrice() {
        return 49.9;
    }
}
