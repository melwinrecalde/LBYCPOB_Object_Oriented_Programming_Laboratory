public class Square {


    // Constructor
    // UNDERSTAND: Called when a new Square object is created - initializes object state
    // DECISION: Delegates to setter for validation (reuses existing validation logic)
    // AI-CHECK: Confirmed with textbook that setter delegation is a standard pattern


    // Getter for side
    // UNDERSTAND: Provides controlled access to private field
    // DECISION: No validation needed in getter (only returning value, not modifying)


    // Setter for side with validation
    // UNDERSTAND: Allows modification of side with input validation (positive numbers only)
    // DECISION: Used early return pattern for invalid input (instead of throwing exception)
    // because this is designed for beginners learning control flow


    // Method to calculate area
    // UNDERSTAND: Returns area of square = side * side
    // DECISION: No input parameters needed (side already stored in object state)
    // Result is always non-negative


    // Method to calculate perimeter
    // UNDERSTAND: Returns perimeter of square = 4 * side
    // DECISION: Separated from calculateArea() to follow Single Responsibility Principle



}