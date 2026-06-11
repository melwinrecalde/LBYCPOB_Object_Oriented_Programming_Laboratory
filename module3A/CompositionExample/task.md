**Composition Example**

Composition is a strong "has-a" relationship. The contained object’s lifetime depends on the whole.
For example, a Human creates and owns a Heart. The heart cannot exist without the human.
```text
┌─────────────────────────────┐         ┌─────────────────────────────┐
│           Human             │         │           Heart             │
├─────────────────────────────┤         ├─────────────────────────────┤
│ - name : String             │         │                             │
│ - heart : Heart             │         ├─────────────────────────────┤
├─────────────────────────────┤         │ + beat() : void             │
│ + live() : void             │         │                             │
└─────────────────────────────┘         └─────────────────────────────┘
            ◆                                        │
            │                                        │
            │                                        │
            └────────────────────────────────────────┘
               (Composition: Human owns the Heart)
```

**Key idea:**

Heart is created inside Human and cannot exist independently. 
If the human is gone, so is the heart. This is a "strong" ownership.

**Note:**

- Widen the task description sidebar to avoid distorting the ASCII UML diagram