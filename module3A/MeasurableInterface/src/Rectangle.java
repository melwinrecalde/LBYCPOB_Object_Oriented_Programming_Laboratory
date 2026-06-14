public class Rectangle extends Shape implements Measurable2D {

    private double width;
    private double height;

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
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle | color: " + color +
                " | width: " + width +
                " | height: " + height +
                " | area: " + String.format("%.2f", calculateArea()) +
                " | perimeter: " + String.format("%.2f", calculatePerimeter());
    }
}