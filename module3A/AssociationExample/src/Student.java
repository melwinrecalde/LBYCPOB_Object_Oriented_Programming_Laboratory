// Student.java
public class Student {
    private String name;
    private Teacher teacher;   // Association: Student "knows about" a Teacher

    public Student(String name, Teacher teacher) {
        this.name    = name;
        this.teacher = teacher;
    }

    public void showTeacher() {
        IO.println(name + " is taught by " + teacher.getName());
    }
}