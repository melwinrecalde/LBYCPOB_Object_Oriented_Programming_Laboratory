**Realization Example**

Realization is an OOP relationship in which a class agrees to fulfill 
the contract specified by an interface by implementing all of its required methods.
For example, a Swimmable interface is implemented by Duck, an animal that swims.
```text
┌─────────────────────┐
│    «interface»      │
│     Swimmable       │
├─────────────────────┤
│ + swim() : void     │
│ + canDive() :       │
│     boolean         │
└─────────────────────┘
          △
          │  (implements)
          │  (dashed line)
          │
┌─────────┴─────────┐
│       Duck        │
├───────────────────┤
│ - name : String   │
├───────────────────┤
│ + swim() : void   │
│ + canDive() :     │
│     boolean       │
└───────────────────┘
```

**Key idea:**

The interface defines what a swimming animal must be able to do. Duck defines how it does it. 
Any class implementing Swimmable is guaranteed to have both methods.

**Note:**

- Widen the task description sidebar to avoid distorting the ASCII UML diagram