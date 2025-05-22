package O;
/**
 * Representa um círculo.
 * Segue o Princípio Aberto/Fechado (OCP), pois estende a classe Shape
 * e implementa o cálculo da área sem modificar o código existente.
 */
public class Circle extends Shape{
    private double radius;


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
