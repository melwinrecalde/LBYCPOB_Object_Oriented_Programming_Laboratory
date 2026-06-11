class GradeTrackerWithVerification {

    //  CONSTANTS: // TODO: Describe the purpose of each constants
    // 'final' means the value cannot change once set (i.e., a constant).
    final int    MAX_STUDENTS = 20;
    final double MIN_SCORE    = 0.0;
    final double MAX_SCORE    = 100.0;
    final int    SEPARATOR    = 50;

    // ARRAYS (one slot per student) TODO: Describe the purpose of each arrays
    String[] studentNames  = new String[MAX_STUDENTS];
    double[] rawGrades     = new double[MAX_STUDENTS];
    String[] numericGrades = new String[MAX_STUDENTS];
    char[]   letterRanks   = new char[MAX_STUDENTS];
    String[] studentIDs    = new String[MAX_STUDENTS];

    // Number of students currently stored
    int studentCount = 0;

    // ----------------------------------------------------------------
    // ENTRY POINT
    // ----------------------------------------------------------------
    void main() {
        displayMenu();
    }

    // ----------------------------------------------------------------
    // MENU
    // ----------------------------------------------------------------
    // TODO:
    void displayMenu() {
        // Your code here
        // Loop repeats until the user picks "5" (Exit).
    }

    // ----------------------------------------------------------------
    // STUDENT DATA INPUT
    // ----------------------------------------------------------------
    // TODO:
    void inputStudentData() {
        IO.println("STUDENT DATA ENTRY:");

        // Ask how many students; keep asking until the number is in range.
        // do-while guarantees the prompt runs at least once before checking.

        // Your code here

        // for-loop: we know exactly how many students to process.

        // Your code here
    }

    // ----------------------------------------------------------------
    // LAB PERFORMANCE INPUT  (average of 5 module scores)
    // ----------------------------------------------------------------
    // TODO:
    double inputLabPerformance() {
        //Your code here
        return 0.0; // placeholder
    }

    // ----------------------------------------------------------------
    // SINGLE-COMPONENT SCORE INPUT  (reused for 4 components)
    // ----------------------------------------------------------------
    double inputComponentScore(String prompt) {
        double score;
        do {
            IO.print(prompt);
            score = Double.parseDouble(IO.readln().trim());
            if (score < MIN_SCORE || score > MAX_SCORE)
                IO.println("  Score must be between 0.0 and 100.0.");
        } while (score < MIN_SCORE || score > MAX_SCORE);
        return score;
    }

    // ----------------------------------------------------------------
    // COMPUTE AVERAGE  (sum all elements, divide by count)
    // ----------------------------------------------------------------
    // TODO:
    double computeAverage(double[] scores) {
        if (scores == null || scores.length == 0) return 0.0;  // guard: empty/null array

        // Your code here

        return 0.0;
    }

    // ----------------------------------------------------------------
    // COMPUTE WEIGHTED RAW GRADE
    // ----------------------------------------------------------------
    // TODO:
    double computeRawGrade(double lab, double participation,
                           double teacherEval, double exam, double project) {
        double raw = 0.0; // placeholder

        // Your code here

        // Round to 2 decimal places.
        return Math.round(raw * 100.0) / 100.0;
    }

    // ----------------------------------------------------------------
    // ASSIGN NUMERIC GRADE
    // if-else ladder is used because grading boundaries are ranges
    // (e.g. avg >= 96.0), not exact values. switch only matches exact values.
    // ----------------------------------------------------------------
    // TODO:
    String assignNumericGrade(double avg) {
        // Your code here
         return "0.0";   // below 70 -> Failed
    }

    // ----------------------------------------------------------------
    // ASSIGN LETTER RANK  (same ladder logic, returns a char)
    // ----------------------------------------------------------------
    // TODO:
    char assignLetterRank(double avg) {
        // Your code here
        return 'F';
    }

    // ----------------------------------------------------------------
    // GET REMARKS  (overloaded: one version for String, one for char)
    // switch works here because inputs are discrete, known values.
    // ----------------------------------------------------------------
    // TODO:
    String getRemarks(String grade) {
        // Your code here
        return  "Unknown";
    }

    // TODO:
    String getRemarks(char rank) {
        // toUpperCase allows lowercase input to match the same way as uppercase.
        // Your code here
        return  "Unknown";
    }

    // ----------------------------------------------------------------
    // CLASS STATISTICS
    // ----------------------------------------------------------------
    // TODO:
    void computeClassStats() {
        if (studentCount == 0) {
            IO.println("No data yet. Please enter student data first (Option 1).");
            return;
        }

        // Start with the first student as the initial best/worst.

        // Your code here

        printSeparatorLine();
        IO.println("           CLASS STATISTICS REPORT");

        // Your code here;

        printSeparatorLine();
    }

    // ----------------------------------------------------------------
    // PRINT REPORT  (formatted table of all students)
    // ----------------------------------------------------------------
    // TODO:
    void printReport() {
        if (studentCount == 0) {
            IO.println("No data to display. Please enter student data first.");
            return;
        }

        // StringBuilder builds the table string piece by piece.
        // Using + inside a loop creates many temporary String objects;
        // StringBuilder avoids that by using a single mutable buffer.

        // Your code here
    }

    // ----------------------------------------------------------------
    // ID VERIFICATION
    // ----------------------------------------------------------------
    // TODO:
    void verifyID() {
        // Your code here
    }

    // ----------------------------------------------------------------
    // CALCULATE DOT PRODUCT
    // Multiplies each digit by a decreasing weight (8 down to 1),
    // then sums the products.
    // Example: "11191031" -> 1*8 + 1*7 + 1*6 + 9*5 + 1*4 + 0*3 + 3*2 + 1*1 = 77
    // ----------------------------------------------------------------
    // TODO:
    int calculateDotProduct(String idNumber) {
        // Your code here
        return 0;
    }

    // ----------------------------------------------------------------
    // UTILITY: print a separator line
    // ----------------------------------------------------------------
    void printSeparatorLine() {
        IO.println("=".repeat(SEPARATOR));
    }
}