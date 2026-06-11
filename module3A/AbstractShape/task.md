**Abstract Shape**

Develop an abstract Shape class and use inheritance to create the following 
concrete shape classes: Circle, Ellipse, Rectangle, Cone, Sphere, and Cylinder. 
Ensure that each class provides its own implementation of the abstract methods 
defined in Shape.
```text
+------------------------------------+
|            <<abstract>>            |
|               Shape                |
+------------------------------------+
| # color: String                    |
+------------------------------------+
| + Shape()                          |
| + Shape(color: String)             |
| + getColor(): String               |
| + toString(): String    {abstract} |
+------------------------------------+
```
As a final step, implement inheritance by making Square a subclass of Rectangle.
```text
+-------------------------------------------+
|                 Rectangle                 |
+-------------------------------------------+
| - height : double                         |
| - width  : double                         |
+-------------------------------------------+
| + setWidth(double)  : void                |
| + setHeight(double) : void                |
| + getWidth()        : double              |
| + getHeight()       : double              |
| + toString()        : String              |
+-------------------------------------------+
                    △
                    │
                    │
+-------------------------------------------+
|                  Square                   |
+-------------------------------------------+
| - side : double                           |
+-------------------------------------------+
| + setSide(double) : void                  |
| + getSide()       : double                |
| + toString()      : String                |
+-------------------------------------------+
```

**Note**

- (-) means private, while (+) means public, and (#) means protected