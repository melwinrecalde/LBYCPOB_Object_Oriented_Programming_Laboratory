**Dependency Example**

Dependency is a relationship in which one class temporarily relies on or uses another class 
to perform a specific task, without owning or permanently storing it.
For example, a Doctor uses a Syringe during a procedure. 
The syringe is not stored as a field.
```text
┌───────────────────┐                      ┌───────────────────┐
│     Syringe       │                      │      Doctor       │
├───────────────────┤                      ├───────────────────┤
│ - medicine: String│                      │ - name: String    │
├───────────────────┤                      ├───────────────────┤
│ + getMedicine():  │                      │ + treat(Syringe): │
│     String        │                      │     void          │
└───────────────────┘                      └───────────────────┘
         ^                                           │
         │                                           │
         └-------------------------------------------┘
 (Dependency: Syringe is used only for a method call, never stored)
```

**Key idea:**

Doctor depends on Syringe only for the duration of the method call. 
The syringe is created outside, passed in, used once, and discarded 
— the doctor does not keep it. This is the loosest relationship.

**Note:**

- Widen the task description sidebar to avoid distorting the ASCII UML diagram