public class Ellipse extends Shape {

    private double semiMajor;
    private double semiMinor;

    // required by tests
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
    public String toString() {
        return "Ellipse[semiMajor=" + semiMajor +
                ", semiMinor=" + semiMinor +
                ", color=" + color + "]";
    }
}