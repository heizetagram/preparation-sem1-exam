package interfaces.geometricshapes;

public class Rectangle implements GeometricShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getters
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    // Setters
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
