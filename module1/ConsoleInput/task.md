**Console Input Practice**

Write a Java program that reads different types of input from the user using `IO.readln()` and then displays the entered values.

Your program should:

1. Prompt the user to enter values for each data type
2. Read input using `IO.readln()` (always returns a String)
3. Convert/parse each input to the correct data type
4. Store each value in the appropriate variable type
5. Print all entered values back to the console

**Data Types to Read:**
- `int` - whole number (use `Integer.parseInt()`)
- `double` - decimal number (use `Double.parseDouble()`)
- `char` - single character (use `.charAt(0)`)
- `boolean` - true or false (use `Boolean.parseBoolean()`)
- `String` - text (no conversion needed)

**Example Program Flow:**
```text
Enter an integer: 25
Enter a decimal number: 3.14
Enter a single character: A
Enter true or false: true
Enter your name: Juan

You entered:
25
3.14
A
true
Juan
```

**Requirements:**
1. Use IO.readln() to read all input from the user
2. Convert each input to the correct data type using parsing methods
3. Store values in variables of type: `int`, `double`, `char`, `boolean`, `String`
4. Print all five values after reading them, each on a new line
5. Include user prompts before each input

**Hints:**
- Integer.parseInt(IO.readln()) converts String to int
- Double.parseDouble(IO.readln()) converts String to double
- IO.readln().charAt(0) gets the first character of input
- Boolean.parseBoolean(IO.readln()) converts "true" to true (case-insensitive)
- No conversion needed for String - assign directly