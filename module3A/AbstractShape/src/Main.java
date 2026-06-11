public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5, "red"),
                new Rectangle(4, 7, "blue"),
                new Ellipse(6, 3, "green"),
                new Square(4, "yellow"),
                new Sphere(5, "orange"),
                new Cylinder(3, 8, "purple"),
                new Cone(4, 9, "pink")
        };

        for (Shape s : shapes) {
            System.out.println(s.toString());
        }
    }
}