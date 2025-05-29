package structural.decoractor;

public class ProductStampFrontAndBackDecorator extends ProductDecorator{
    public ProductStampFrontAndBackDecorator(ProductProtocol product) {
        super(product);
    }

    public double getPrice() {
        return super.getPrice() + 10.0;
    }
    public String getName() {
        return super.getName() + " Frente e Verso";
    }
}
