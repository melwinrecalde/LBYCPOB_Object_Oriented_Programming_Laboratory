public class Square extends Rectangle {

    // optional internal representation (kept for requirement)
    private double side;

    // default constructor
    public Square() {
        super();
        this.side = 0.0;
        setWidth(0.0);
        setHeight(0.0);
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
        return "Square[side=" + side + ", color=" + color + "]";
    }
}