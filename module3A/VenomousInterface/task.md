**Venomous Interface**

Implement the following UML Class diagram (Widen if figure distorted):
```text
                    ┌──────────────────────────┐
                    │      «interface»         │
                    │        Venomous          │
                    ├──────────────────────────┤
                    │                          │
                    ├──────────────────────────┤
                    │ + injectVenom() : void   │
                    │ + getVenomPotency() : int│
                    └──────────────────────────┘
                              △
                              │
              ┌───────────────┴────────────────────┐
              │                                    │
    ┌─────────────────────┐         ┌───────────────────────────┐
    │       Spider        │         │         Scorpion          │
    ├─────────────────────┤         ├───────────────────────────┤
    │ - potency : int     │         │ - stingerLength :  double │
    │                     │         │ - potency : int           │
    ├─────────────────────┤         ├───────────────────────────┤
    │ + injectVenom() :   │         │ + injectVenom() :         │
    │       void          │         │       void                │
    │ + getVenomPotency() │         │ + getVenomPotency()       │
    │       : int         │         │       : int               │
    └─────────────────────┘         └───────────────────────────┘
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
```text
Spider:
Venom potency: 7
Spider bites and injects venom with potency: 7

Scorpion:
Venom potency: 9
Scorpion stings with stinger length 3.2 cm and injects venom potency: 9
```