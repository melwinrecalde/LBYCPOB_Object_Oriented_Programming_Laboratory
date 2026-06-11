// Example: Circle.java
public class Circle extends Shape implements Measurable2D {

    private double radius;

    public Circle(double radius) {
        super("white");
        this.radius = radius;
    }

    public Circle(double radius, String color) {
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
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle | color: " + color
                + " | radius: "     + radius
                + " | area: "       + String.format("%.2f", calculateArea())
                + " | perimeter: "  + String.format("%.2f", calculatePerimeter());
    }
}