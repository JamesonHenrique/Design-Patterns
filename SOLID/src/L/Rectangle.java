package L;


import java.util.stream.Stream;
/**
 * Representa um retângulo.
 * Segue o Princípio de Substituição de Liskov (LSP), pois pode ser usado
 * no lugar da classe base Shape sem quebrar o comportamento esperado.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
