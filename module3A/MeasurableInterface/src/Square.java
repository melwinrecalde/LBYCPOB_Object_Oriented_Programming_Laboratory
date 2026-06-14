public class Square extends Rectangle {

    private double side;

    public Square() {
        super();
        this.side = 0.0;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color) {
        super(side, side, color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
        setWidth(side);
        setHeight(side);
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square | color: " + color +
                " | side: " + side +
                " | area: " + String.format("%.2f", calculateArea()) +
                " | perimeter: " + String.format("%.2f", calculatePerimeter());
    }
}