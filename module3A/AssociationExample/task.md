**Association Example**

Association is a general relationship where one object knows about or uses another object. 
For example, a Student has a Teacher. Both exist independently:
```text
┌─────────────────┐                ┌─────────────────┐
│    Teacher      │                │    Student      │
├─────────────────┤                ├─────────────────┤
│ - name: String  │                │ - teacher:      │
├─────────────────┤                │     Teacher     │
│ + getName():    │                │ - name: String  │
│     String      │                ├─────────────────┤
└─────────────────┘                │ + showTeacher() │
         │                         │     : void      │
         │                         └─────────────────┘
         │                                  │
         └──────────────────────────────────┘
    (Association: Student "knows about" a Teacher)
```

**Note:**

- Widen the task description sidebar to avoid distorting the ASCII UML diagram