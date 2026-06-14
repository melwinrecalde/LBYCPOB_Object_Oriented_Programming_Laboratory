public class Sphere extends Shape implements Measurable3D {

    private double radius;

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
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere | color: " + color +
                " | radius: " + radius +
                " | surface area: " + String.format("%.2f", calculateSurfaceArea()) +
                " | volume: " + String.format("%.2f", calculateVolume());
    }
}