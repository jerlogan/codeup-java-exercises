package shapes;

public class Circle {
    private double radius;
    public double circleRadius (double radius) {
        return radius;
    }
    public double getArea(double radius) {
        return 3.14 * (radius * radius);
    }
    public double getCircumference(double radius) {
        return 3.14 * (radius + radius);
    }
}
