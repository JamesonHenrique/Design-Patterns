package I;

public class MainI {
    public static void main(String[] args) {
        var circle = new Circle();
        circle.setRadius(10);
        var sphere = new Sphere();
        sphere.setRadius(10);
        System.out.println("Area esperada do círculo: " + circle.getArea());
        System.out.println("Area esperada da esfera: " + sphere.getArea());
        System.out.println("Volume esperado do esfera: " + sphere.getVolume());
    }
}
