**Ellipse Class**

Implement the following UML Class:
```text
+----------------------------------+
|             Ellipse              |
+----------------------------------+
| - semiMajorAxis: double          |
| - semiMinorAxis: double          |
+----------------------------------+
| + Ellipse(double, double)        |
| + getSemiMajorAxis(): double     |
| + setSemiMajorAxis(double): void |
| + getSemiMinorAxis(): double     |
| + setSemiMinorAxis(double): void |
| + calculateArea(): double        |
| + calculatePerimeter(): double   |
| + isCircle(): boolean            |
+----------------------------------+
```

**Note**

- (-) means private; while (+) means public
- The constructor accepts semiMajorAxis and semiMinorAxis as its argument