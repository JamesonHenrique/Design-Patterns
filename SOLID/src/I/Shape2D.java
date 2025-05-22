package I;
/**
 * Interface que representa formas geométricas bidimensionais.
 * Segue o Princípio da Segregação de Interfaces (ISP), pois fornece apenas
 * os métodos necessários para formas 2D, evitando métodos irrelevantes.
 */
public interface Shape2D {
    double getArea();
}