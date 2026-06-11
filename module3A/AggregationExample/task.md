**Aggregation Example**

Aggregation is a weak "has-a" relationship. 
The contained object can exist independently of the whole.
For example, a Library contains Books. Books can exist without the library:
```text
              ┌──────────────────────────┐
              │         Library          │
              ├──────────────────────────┤
              │ - name : String          │
              │ - books : ArrayList<Book>│
              ├──────────────────────────┤
              │ + showBooks() : void     │
              │ + addBook(Book) : void   │
              └──────────────────────────┘
                          ◇  (aggregation)
                          │
                          │
              ┌───────────────────────┐
              │         Book          │
              ├───────────────────────┤
              │ - title : String      │
              ├───────────────────────┤
              │ + getTitle() : String │
              └───────────────────────┘
```

**Key idea:**

Books are created outside the library and passed in. They can outlive the library. 
This is a "weak" ownership.

**Note:**

- Widen the task description sidebar to avoid distorting the ASCII UML diagram