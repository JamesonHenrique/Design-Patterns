package structural.decoractor;

public class ProductStampDecorator extends ProductDecorator{
    public ProductStampDecorator(ProductProtocol product) {
        super(product);
    }

    public double getPrice() {
        return super.getPrice() + 10.0;
    }
    public String getName() {
        return super.getName() + " Estampada";
    }
}
