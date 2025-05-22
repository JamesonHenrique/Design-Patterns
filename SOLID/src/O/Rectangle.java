package O;
/**
 * Representa um retângulo.
 * Segue o Princípio Aberto/Fechado (OCP), pois estende a classe Shape
 * e implementa o cálculo da área sem modificar o código existente.
 */
public class Rectangle extends Shape{
    private double length;
    private double width;


    @Override
    public double calculateArea() {
        return length * width;
    }
}
