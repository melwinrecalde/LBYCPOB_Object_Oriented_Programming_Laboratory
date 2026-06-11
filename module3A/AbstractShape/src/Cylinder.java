public class Cylinder extends Shape {

    private double radius;
    private double height;

    // required by tests
    public Cylinder() {
        super("white");
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cylinder(double radius, double height) {
        super("white");
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(color);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + radius +
                ", height=" + height +
                ", color=" + color + "]";
    }
}