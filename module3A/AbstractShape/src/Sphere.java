public class Sphere extends Shape {

    private double radius;

    // required by tests
    public Sphere() {
        super("white");
        this.radius = 0.0;
    }

    public Sphere(double radius) {
        super("white");
        this.radius = radius;
    }

    public Sphere(double radius, String color) {
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
        return "Sphere[radius=" + radius + ", color=" + color + "]";
    }
}