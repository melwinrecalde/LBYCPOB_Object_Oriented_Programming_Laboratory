**Abstract Animal**

Implement the following UML Class diagram (Widen if figure distorted):
```text
┌─────────────────────────┐
│       «abstract»        │
│         Animal          │
├─────────────────────────┤
│                         │
├─────────────────────────┤
│ + makeSound() : void    │
└─────────────────────────┘
            △
            │
            ├───────────────────────────┐
            │                           │
┌─────────────────────────┐  ┌─────────────────────────┐
│         Mammal          │  │         Bird            │
├─────────────────────────┤  ├─────────────────────────┤
│ - furColor : String     │  │ - wingSpan : double     │
├─────────────────────────┤  ├─────────────────────────┤
│ + getFurColor() : String│  │ + getWingSpan() : double│
│ + setFurColor(String)   │  │ + setWingSpan(double)   │
│   : void                │  │   : void                │
│ + makeSound() : void    │  │ + makeSound() : void    │
│ + nurse() : void        │  │ + layEgg() : void       │
└─────────────────────────┘  └─────────────────────────┘
```

**Note**
- Widen the task description sidebar to avoid distorting the ASCII UML diagram 
- To keep the focus on object-oriented design and class relationships, implement each method 
with a simple output statement that reflects the method's behavior. For example:
```text
IO.println("Mammal makes a sound");
```
Complex logic is not required at this task

**Example Output**
```textDog fur color: Brown
Dog fur color: Brown
Mammal makes a sound
Mammal is nursing its young

Eagle wing span: 2.5 meters
Bird makes a sound
Bird lays an egg
```