public class Student {

    private String name;
    private Teacher teacher; // Association

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void showTeacher() {
        System.out.println(name + " is taught by " + teacher.getName());
    }
}