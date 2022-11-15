public class Circle extends Shape{
    private double radius;
    final double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }
    @Override
    public double getPerimeter() {
        return (2 * pi * radius);
    }
}
