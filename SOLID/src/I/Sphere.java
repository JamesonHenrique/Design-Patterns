package I;
/**
 * Interface que representa formas geométricas tridimensionais.
 * Segue o Princípio da Segregação de Interfaces (ISP), pois fornece apenas
 * os métodos necessários para formas 3D, evitando métodos irrelevantes.
 */
public class Sphere implements Shape3D {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
