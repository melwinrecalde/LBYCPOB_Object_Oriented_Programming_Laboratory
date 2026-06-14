public class Ellipse extends Shape implements Measurable2D {

    private double semiMajor;
    private double semiMinor;

    public Ellipse() {
        super("white");
        this.semiMajor = 0.0;
        this.semiMinor = 0.0;
    }

    public Ellipse(double semiMajor, double semiMinor) {
        super("white");
        this.semiMajor = semiMajor;
        this.semiMinor = semiMinor;
    }

    public Ellipse(double semiMajor, double semiMinor, String color) {
        super(color);
        this.semiMajor = semiMajor;
        this.semiMinor = semiMinor;
    }

    public double getSemiMajor() {
        return semiMajor;
    }

    public void setSemiMajor(double semiMajor) {
        this.semiMajor = semiMajor;
    }

    public double getSemiMinor() {
        return semiMinor;
    }

    public void setSemiMinor(double semiMinor) {
        this.semiMinor = semiMinor;
    }

    @Override
    public double calculateArea() {
        return Math.PI * semiMajor * semiMinor;
    }

    @Override
    public double calculatePerimeter() {
        double h = Math.pow(semiMajor - semiMinor, 2)
                / Math.pow(semiMajor + semiMinor, 2);

        return Math.PI * (semiMajor + semiMinor)
                * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }

    @Override
    public String toString() {
        return "Ellipse | color: " + color +
                " | semiMajor: " + semiMajor +
                " | semiMinor: " + semiMinor +
                " | area: " + String.format("%.2f", calculateArea()) +
                " | perimeter: " + String.format("%.2f", calculatePerimeter());
    }
}