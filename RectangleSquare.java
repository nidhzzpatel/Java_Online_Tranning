class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class RectangleSquare {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle:");
        rectangle.printArea();
        rectangle.printPerimeter();

        Square square = new Square(4.0);
        System.out.println("\nSquare:");
        square.printArea();
        square.printPerimeter();
    }
}
