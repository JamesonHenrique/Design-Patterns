package I;
/**
 * Interface que representa formas geométricas tridimensionais.
 * Segue o Princípio da Segregação de Interfaces (ISP), pois fornece apenas
 * os métodos necessários para formas 3D, evitando métodos irrelevantes.
 */
public interface Shape3D {
    double getArea();
    double getVolume();
}
