package structural.decoractor;

public class ProductDecorator implements ProductProtocol{
    protected ProductProtocol product;

    public ProductDecorator(ProductProtocol product) {
        this.product = product;
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public double getPrice() {
        return product.getPrice();
    }
}
