package structural.decoractor;

public class ProductCustomizationDecorator extends ProductDecorator{
    public ProductCustomizationDecorator(ProductProtocol product) {
        super(product);
    }

    public double getPrice() {
        return super.getPrice() + 50.0;
    }
    public String getName() {
        return super.getName() + " Customizada";
    }
}
