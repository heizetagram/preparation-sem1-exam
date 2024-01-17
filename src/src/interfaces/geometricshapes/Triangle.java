package interfaces.geometricshapes;

public class Triangle implements GeometricShape {
    private double a;
    private double b;
    private double c;
    private double s;

    public Triangle(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
        calculateS(a, b, c);
    }

    // Getters
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    // Setters
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    private void calculateS(double a, double b, double c) {
        s = (a + b + c) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
