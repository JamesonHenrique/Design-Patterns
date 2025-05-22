package L;

public class MainL {
    public static void main(String[] args) {
        var square = new Square(5);
        System.out.println("Area esperada do quadrado: " + square.getArea());
        var rect = new Rectangle(4, 5);
        System.out.println("Area esperada do retângulo: " + rect.getArea());
    }
}
