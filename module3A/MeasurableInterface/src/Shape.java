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

    @Override
    public abstract String toString();
}