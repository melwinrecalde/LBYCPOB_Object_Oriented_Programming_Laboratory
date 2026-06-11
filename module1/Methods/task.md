**Methods Practice**

Write a Java program that demonstrates how to define and call different types of methods.

Your program should define and call the following methods:

**Part 1: Void method without parameters**
- Define a method `printWelcomeMessage()` that prints "Welcome to Java Methods!"
- Call this method from main

**Part 2: Void method with parameters**
- Define a method `printSum(int a, int b)` that calculates and prints the sum of two numbers
- Call this method with values 10 and 5

**Part 3: Method that returns a value**
- Define a method `getSquare(int num)` that returns the square of a number
- Call this method with value 4 and print the result

**Part 4: Method with multiple parameters and return**
- Define a method `getProduct(int x, int y)` that returns the product of two numbers
- Call this method with values 6 and 7 and print the result

**Expected Output**
```text
Welcome to Java Methods!
Sum of 10 and 5 is: 15
Square of 4 is: 16
Product of 6 and 7 is: 42
```

**Requirements:**
1. Define a void method with no parameters
2. Define a void method with two parameters
3. Define a method that returns a value (int)
4. Define a method with multiple parameters that returns a value
5. Call all methods from the main method 
6. Print all outputs as shown in the example

**Hints:**
- Void methods use void as return type and use IO.println() to print
- Return methods use a data type (like int) and use return keyword
- Method syntax: accessModifier returnType methodName(parameters) { }
- Call methods using: methodName(arguments)