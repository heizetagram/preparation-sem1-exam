package interfaces.geometricshapes;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Circle c1 = new Circle(21);
        Rectangle r1 = new Rectangle(13, 40);
        Triangle t1 = new Triangle(12, 13, 15);

        printCircleInfo(c1);
        System.out.println();
        printRectangleInfo(r1);
        System.out.println();
        printTriangleInfo(t1);
    }

    private void printCircleInfo(Circle circle) {
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
    }

    private void printRectangleInfo(Rectangle rectangle) {
        System.out.println("Rectangle:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
    }

    private void printTriangleInfo(Triangle triangle) {
        System.out.println("Triangle:");
        System.out.println("A: " + triangle.getA());
        System.out.println("B: " + triangle.getB());
        System.out.println("C: " + triangle.getC());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
    }
}
