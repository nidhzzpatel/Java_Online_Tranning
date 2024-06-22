import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;

public class GeometryPackageDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle:");
        System.out.println("Radius: 5.0");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4.0, 7.0);
        System.out.println("\nRectangle:");
        System.out.println("Width: 4.0, Height: 7.0");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("\nTriangle:");
        System.out.println("Sides: 3.0, 4.0, 5.0");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
