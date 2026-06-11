void main() {
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
        IO.println(s.toString());
    }
}

/*
Example Output:
Circle | color: red | radius: 5.0 | area: 78.54 | perimeter: 31.42
Rectangle | color: blue | width: 4.0 | height: 7.0 | area: 28.00 | perimeter: 22.00
Ellipse | color: green | semiMajor: 6.0 | semiMinor: 3.0 | area: 56.55 | perimeter: 29.07
Square | color: yellow | side: 4.0 | area: 16.00 | perimeter: 16.00
Sphere | color: orange | radius: 5.0 | surface area: 314.16 | volume: 523.60
Cylinder | color: purple | radius: 3.0 | height: 8.0 | surface area: 207.35 | volume: 226.19
Cone | color: pink | radius: 4.0 | height: 9.0 | surface area: 174.03 | volume: 150.80
 */