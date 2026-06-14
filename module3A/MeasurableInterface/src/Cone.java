public class Cone extends Shape implements Measurable3D {

    private double radius;
    private double height;

    public Cone() {
        super("white");
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cone(double radius, double height) {
        super("white");
        this.radius = radius;
        this.height = height;
    }

    public Cone(double radius, double height, String color) {
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
    public double calculateSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cone | color: " + color +
                " | radius: " + radius +
                " | height: " + height +
                " | surface area: " + String.format("%.2f", calculateSurfaceArea()) +
                " | volume: " + String.format("%.2f", calculateVolume());
    }
}