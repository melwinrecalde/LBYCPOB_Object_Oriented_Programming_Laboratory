**Selection Control Statements Practice**

Write a Java program that demonstrates the use of selection control statements: if, if-else, if-else-if, and switch.

Your program should:

1. Read a numeric score (0-100) from the user using `IO.readln()`
2. Determine and display the corresponding letter rank and remark based on the scale below
3. Display a status message (PASSED/FAILED) based on the grade

**Grading Scale:**

| Score Range | Letter Rank (char) | Remark |
| :--- | :--- | :--- |
| 96 - 100 | S | Excellent |
| 92 - 95 | A | Superior |
| 88 - 91 | B | Very Good |
| 83 - 87 | C | Good |
| 78 - 82 | D | Satisfactory |
| 74 - 77 | E | Fair |
| 70 - 73 | P | Poor/Passed |
| Below 70 | F | Failed |

**Program Requirements:**

**Part 1: if-else-if statement** - Determine letter rank and remark based on score:
- Use the grading scale above
- Display both the letter rank and remark
- Example output: "Rank: S - Excellent"

**Part 2: if-else statement** - Determine PASSED/FAILED status:
- Ranks S, A, B, C, D, E, P are PASSED
- Rank F is FAILED
- Print "Status: PASSED" or "Status: FAILED"

**Part 3: switch statement** - Display additional feedback based on letter rank:
- S: "Excellent work! Keep it up!"
- A: "Superior performance! You are doing great!"
- B: "Very good job! Aim higher next time!"
- C: "Good effort! You can do better!"
- D: "Satisfactory. Need more practice."
- E: "Fair. Study harder to improve."
- P: "Poor but passed. Work much harder!"
- F: "Failed. Please retake the course."

**Part 4: Simple if statement** - Bonus message for perfect score:
- If score == 100: print "Perfect Score! Congratulations!"

**Example Program Flow:**
```text
Enter score (0-100): 94

Rank: A - Superior
Status: PASSED
Superior performance! You are doing great!
```

**Requirements:**
1. Use IO.readln() and Integer.parseInt() to read the score
2. Use if-else-if for rank determination
3. Use if-else for PASSED/FAILED status
4. Use switch statement for rank feedback
5. Use simple if for perfect score bonus message
6. Print all results on separate lines
7. Handle decimal inputs (double) for scores below 70

**Hints:**
- Check ranges from highest to lowest (96-100 first, then 92-95, etc.)
- Use double for score variable to handle "Below 70.0" requirement
- Use Double.parseDouble() instead of Integer.parseInt()
- Switch statement should handle each letter rank