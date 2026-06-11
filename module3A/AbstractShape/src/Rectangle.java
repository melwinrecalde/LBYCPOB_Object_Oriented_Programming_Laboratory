public class Rectangle extends Shape {

    private double width;
    private double height;

    // required by tests
    public Rectangle() {
        super("black");
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(double width, double height) {
        super("black");
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + ", color=" + color + "]";
    }
}