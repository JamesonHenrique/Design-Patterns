package L;
/**
 * Representa um quadrado.
 * Segue o Princípio de Substituição de Liskov (LSP), pois não depende de um comportamento específico de outra classe.
 */
public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
