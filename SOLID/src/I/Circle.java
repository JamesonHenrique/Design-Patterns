package I;
/**
 * Interface que representa formas geométricas tridimensionais.
 * Segue o Princípio da Segregação de Interfaces (ISP), pois fornece apenas
 * os métodos necessários para formas 3D, evitando métodos irrelevantes.
 */
public class Circle implements Shape2D {
    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }


}
