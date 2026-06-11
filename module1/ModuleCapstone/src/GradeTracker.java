// GradeTracker.java
public class GradeTracker {

    // CONSTANTS: # TODO: Add a brief comment to each constants defining their purpose
    // 'final' means the value cannot be changed after it is set (i.e., a constant).
    final int    MAX_STUDENTS = 20;
    final double MIN_SCORE    = 0.0;
    final double MAX_SCORE    = 100.0;
    final int    SEPARATOR    = 70;

    // ARRAYS (one slot per student): # TODO: Add a brief comment to each arrays defining their purpose
    String[] studentNames  = new String[MAX_STUDENTS];
    double[] rawGrades     = new double[MAX_STUDENTS];
    String[] numericGrades = new String[MAX_STUDENTS];
    char[]   letterRanks   = new char[MAX_STUDENTS];

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
    // TODO: Display menu, get user choice, call appropriate methods
    void displayMenu() {
        // Your code here
        // Loop repeats until the user picks "4" (Exit).
    }

    // ----------------------------------------------------------------
    // STUDENT DATA INPUT
    // ----------------------------------------------------------------
    // TODO: Read student data with validation
    void inputStudentData() {
        IO.println("STUDENT DATA ENTRY:");

        // Your code here

        // Ask how many students; keep asking until the number is in range.
        // do-while guarantees the prompt runs at least once before checking.

        // for-loop: we know exactly how many students to process.

    }

    // ----------------------------------------------------------------
    // LAB PERFORMANCE INPUT  (average of 5 module scores)
    // ----------------------------------------------------------------
    // TODO: Input 5 module scores and return their average
    double inputLabPerformance() {

        // Your code here

        return 0.0; // placeholder
    }

    // ----------------------------------------------------------------
    // SINGLE-COMPONENT SCORE INPUT  (reused for 4 components)
    // ----------------------------------------------------------------
    // TODO: Input a single score with validation (reused for multiple components)
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
    // TODO: Compute average of an array of scores
    double computeAverage(double[] scores) {
        if (scores == null || scores.length == 0) return 0.0;  // guard: empty array

        // Your code here
        return 0.0; // placeholder
    }

    // ----------------------------------------------------------------
    // COMPUTE WEIGHTED RAW GRADE
    // ----------------------------------------------------------------
    // TODO: Compute weighted raw grade from five components
    double computeRawGrade(double lab, double participation,
                           double teacherEval, double exam, double project) {
        double raw = 0.0; // placeholder
        // Your code here
        // Round to 2 decimal places.
        return Math.round(raw * 100.0) / 100.0;
    }

    // ----------------------------------------------------------------
    // ASSIGN NUMERIC GRADE  (if-else ladder: ranges cannot use switch)
    // ----------------------------------------------------------------
    // TODO: Assign numeric grade based on raw score
    // Grading scale:
    // 96-100 -> 4.0  (Excellent)
    // 92-95  -> 3.5  (Superior)
    // 88-91  -> 3.0  (Very Good)
    // 83-87  -> 2.5  (Good)
    // 78-82  -> 2.0  (Satisfactory)
    // 74-77  -> 1.5  (Fair)
    // 70-73  -> 1.0  (Poor/Pass)
    // below 70 -> 0.0 (Failed)
    String assignNumericGrade(double avg) {
        // Your code here
        return "0.0"; // placeholder
    }

    // ----------------------------------------------------------------
    // ASSIGN LETTER RANK  (same ladder logic, returns a char)
    // ----------------------------------------------------------------
    // TODO: Assign letter rank based on raw score (same scale as above)
    // Return: 'S', 'A', 'B', 'C', 'D', 'E', 'P', or 'F'
    char assignLetterRank(double avg) {
        // Your code here
        return 'F'; // placeholder
    }

    // ----------------------------------------------------------------
    // GET REMARKS  (overloaded: one version for String, one for char)
    // switch works here because inputs are discrete, known values.
    // ----------------------------------------------------------------
    // TODO: Return remark string based on numeric grade using switch
    String getRemarks(String grade) {
        // Your code here
        return  "Unknown"; // placeholder
    }

    // TODO: Return remark string based on numeric grade using switch
    String getRemarks(char rank) {
        // Your code here
        return  "Unknown"; // placeholder
    }

    // ----------------------------------------------------------------
    // CLASS STATISTICS
    // ----------------------------------------------------------------
    // TODO: Compute and display class statistics (highest, lowest, mean)
    void computeClassStats() {
        if (studentCount == 0) {
            IO.println("No data yet. Please enter student data first (Option 1).");
            return;
        }

        // Start with the first student as the initial best/worst.

        // Your code here
    }

    // ----------------------------------------------------------------
    // PRINT REPORT  (formatted table of all students)
    // ----------------------------------------------------------------
    // TODO: Display formatted report with all students
    void printReport() {
        if (studentCount == 0) {
            IO.println("No data to display. Please enter student data first.");
            return;
        }

        // StringBuilder builds the table string piece by piece.
        // Using + in a loop creates many temporary String objects; StringBuilder avoids that.
//        Hint:
//        StringBuilder sb = new StringBuilder();
//        sb.append("\n").repeat("=", 70).append("\n");
//        sb.append(String.format("%-5s %-20s %-10s %-7s %-6s %-20s%n",
//                "No.", "Name", "Raw Grade", "Grade", "Rank", "Remarks"));
//        sb.repeat("-", 70).append("\n");

        // Your code here
    }

    // ----------------------------------------------------------------
    // UTILITY: print a separator line
    // ----------------------------------------------------------------
    void printSeparatorLine() {
        IO.println("=".repeat(SEPARATOR));
    }
}