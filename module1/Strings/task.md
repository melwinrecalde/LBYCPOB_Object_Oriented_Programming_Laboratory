**String and StringBuilder Practice**

Write a Java program that demonstrates common String methods and StringBuilder operations.

Your program should perform the following tasks:

**Part 1: String Methods**
- Create a String variable `text = "Hello World"`
- Use the following String methods and print each result:
  - `length()` - print the length of the string
  - `toUpperCase()` - print string in uppercase
  - `toLowerCase()` - print string in lowercase
  - `charAt(0)` - print the first character
  - `substring(0,5)` - print first 5 characters
  - `contains("World")` - print if string contains "World"

**Part 2: StringBuilder Operations**
- Create a StringBuilder object with "Java"
- Perform the following operations and print results after each:
  - Append " Programming" to the string
  - Insert " is fun" at position 4
  - Replace "fun" with "awesome"
  - Reverse the entire string

**Expected Output**
```text
String Methods:
Length: 11
Uppercase: HELLO WORLD
Lowercase: hello world
First character: H
First 5 characters: Hello
Contains 'World': true

StringBuilder Operations:
After append: Java Programming
After insert: Java is fun Programming
After replace: Java is awesome Programming
After reverse: gnimmargorP emosewa si avaJ
```

**Requirements:**
1. Use String methods: `length()`, `toUpperCase()`, `toLowerCase()`, `charAt()`, `substring()`, `contains()`
2. Use StringBuilder methods: `append()`, `insert()`, `replace()`, `reverse()`
3. Print all results with descriptive labels 
4. Include section headers as shown

**Hints:**
- String methods return new strings (Strings are immutable)
- StringBuilder modifies the original object
- StringBuilder append: `sb.append("text")`
- StringBuilder insert: `sb.insert(position, "text")`
- StringBuilder replace: `sb.replace(start, end, "text")`