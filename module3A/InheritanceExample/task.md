**Inheritance Example**

Inheritance is an OOP mechanism that allows a class (subclass) to acquire and reuse the attributes 
and methods of another class (superclass), enabling code reuse and specialization.
For example, a SchoolBus is a kind of Vehicle.
```text
┌─────────────────────────────┐
│           Vehicle           │
├─────────────────────────────┤
│ - brand : String            │
├─────────────────────────────┤
│ + move() : void             │
└─────────────────────────────┘
              △
              │  (Inheritance: SchoolBus "is a" Vehicle)
              │
┌─────────────────────────────┐
│          SchoolBus          │
├─────────────────────────────┤
│ - capacity : int            │
├─────────────────────────────┤
│ + loadStudents() : void     │
└─────────────────────────────┘
```

**Key idea:**

SchoolBus inherits all behavior from Vehicle and adds its own. 
Use inheritance when a strong "is-a" relationship exists.

**Note:**

- Widen the task description sidebar to avoid distorting the ASCII UML diagram