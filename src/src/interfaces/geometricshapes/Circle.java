package interfaces.geometricshapes;

public class Circle implements GeometricShape {
    private double radius;
    private double diameter;

    public Circle(double radius) {
        setRadius(radius);
        calculateDiameter(radius);
    }

    // Getters
    public double getRadius() {
        return radius;
    }
    public double getDiameter() {
        return diameter;
    }

    // Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }
    private void calculateDiameter(double radius) {
        diameter = radius * 2;
    }

    @Override
    public double calculatePerimeter() {
        return GeometricShape.PI * diameter;
    }

    @Override
    public double calculateArea() {
        return GeometricShape.PI * Math.pow(radius, 2);
    }


}
