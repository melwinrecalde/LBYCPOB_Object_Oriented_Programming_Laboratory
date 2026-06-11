**Measurable Interface**

Building on the previous Abstract Shape task, add the Measurable2D and Measurable3D interfaces to the design. 
Modify the shape classes so that:
- Circle, Ellipse, and Rectangle implement the Measurable2D interface.
- Cone, Sphere, and Cylinder implement the Measurable3D interface.

Each implementing class must define all interface methods according to its geometric properties.
```text
+----------------------------------+
|         <<interface>>            |
|          Measurable2D            |
+----------------------------------+
| + calculatePerimeter() : double  |
| + calculateArea() : double       |
+----------------------------------+
```
```text
+-----------------------------------+
|         <<interface>>             |
|          Measurable3D             |
+-----------------------------------+
| + calculateSurfaceArea() : double |
| + calculateVolume() : double      |
+-----------------------------------+
```

**Note**

- Square class inherits calculatePerimeter() and calculateArea() methods from the Rectangle class.   