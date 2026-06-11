package ph.edu.dlsu.lbycpob;

// ============================================================
// Student.java
// RESPONSIBILITY: Stores a single student's data (data model)
// SRP: Pure data container — no I/O, no computation
// STATIC CONCEPT: NO static members here — and intentionally so.
//   Each Student object holds its OWN name, rawGrade, etc.
//   If these were static, ALL students would share one name,
//   one grade, and so on — which is clearly wrong.
//   RULE: Use instance fields when each object needs its own copy.
// ============================================================
public class Student {
    // [DECLARE] Instance fields — each Student object gets its own copy
    // [UNDERSTAND] "private" means only methods inside Student can read
    //              or write these directly. Outside classes must use getters/setters.






    // [CONSTRUCT] Constructor




    // [CONSTRUCT] Constructor: accepts all fields at creation
    // [UNDERSTAND] Uses setters so validation logic is applied automatically.
    //              If a bad value is passed, the setter prints an error
    //              and leaves the field at its default (0 / null / '\0').






    // [SETTER] Sets letter rank with validation
    // [UNDERSTAND] Valid letter ranks are S, A, B, C, D, E, P, F
    // [DECISION] If invalid, prints error and leaves letterRank unchanged






    // [SETTER] Sets numeric grade string with validation
    // [UNDERSTAND] Numeric grade must be a valid format (e.g., "4.0", "3.5", "0.0")
    // [DECISION] If null or blank, prints error and leaves numericGrade unchanged







    // [SETTER] Sets raw grade with validation
    // [UNDERSTAND] Raw grade must be between 0.0 and 100.0
    // [DECISION] If out of range, prints error and leaves rawGrade unchanged



    // [SETTER] Sets student name with validation
    // [UNDERSTAND] Name cannot be null or blank
    // [DECISION] If invalid, prints error and leaves name unchanged





    // [SETTER] Sets student ID number





    // GETTERS:

    // [GETTER] Returns student name


    // [GETTER] Returns raw grade (weighted score)



    // [GETTER] Returns numeric grade string (e.g., "3.5")



    // [GETTER] Returns letter rank char (e.g., 'A')



    // [GETTER] Returns student ID number string




}
