public abstract class Shape {

    protected String color;

    public Shape() {
        this.color = "undefined";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Every concrete subclass must describe itself.
    public abstract String toString();
}