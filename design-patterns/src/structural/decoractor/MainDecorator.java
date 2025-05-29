package structural.decoractor;

public class MainDecorator {
    public static void main(String[] args) {
        Camiseta camiseta = new Camiseta();
        ProductDecorator camisetaDecorator = new ProductDecorator(camiseta);
        System.out.println(camisetaDecorator.getName() + ": " + camiseta.getPrice());
        System.out.println(camisetaDecorator.getName() + " decorada: " +camisetaDecorator.getPrice());

        ProductStampDecorator camisetaStampDecorator = new ProductStampDecorator(camiseta);
        System.out.println(camisetaStampDecorator.getName() + ": " + camisetaStampDecorator.getPrice());

        ProductStampFrontAndBackDecorator camisetaStampFrontAndBackDecorator = new ProductStampFrontAndBackDecorator(camisetaStampDecorator);
        System.out.println(camisetaStampFrontAndBackDecorator.getName() + ": " + camisetaStampFrontAndBackDecorator.getPrice());

        ProductCustomizationDecorator productCustomizationDecorator= new ProductCustomizationDecorator(camiseta);
        System.out.println(productCustomizationDecorator.getName() + ": " + productCustomizationDecorator.getPrice());
    }
}
