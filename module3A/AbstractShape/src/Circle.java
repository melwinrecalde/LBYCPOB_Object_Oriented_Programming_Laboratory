public class Circle extends Shape {

    private double radius;

    // required by tests
    public Circle() {
        super("white");
        this.radius = 0.0;
    }

    public Circle(double radius) {
        super("white");
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}