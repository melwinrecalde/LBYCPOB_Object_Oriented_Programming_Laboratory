**Console Output Practice**

Write a Java program that prints text to the console using `IO.print()` and `IO.println()`.

Perform the following output operations:

1. Print "Hello" using `IO.print()` (no newline at the end)
2. Print " " (a single space) using `IO.print()`
3. Print "World" using `IO.println()` (adds a newline at the end)
4. Print "Java" using `IO.println()` on a new line
5. Print "Programming" using `IO.print()`, then print " is fun!" using `IO.println()`

**Expected Output**
```text
Hello World
Java
Programming is fun!
```

**Explanation of Output:**
- Line 1: "Hello" + "World" (no space before World because the space was printed separately: " ")
- Line 2: "Java" on its own line
- Line 3: "Programming is fun!" (both parts on the same line)
  
**Requirements:**
1. Use IO.print() for output that should NOT move to the next line
2. Use IO.println() for output that SHOULD move to the next line 
3. Print exactly 3 lines of output as shown above 
4. Do not add extra spaces or newlines beyond what is specified

**Hint:**
- IO.print("text") leaves the cursor on the same line 
- IO.println("text") moves the cursor to the next line after printing
- You can chain multiple IO.print() statements to build a single line