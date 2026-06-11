// SchoolBus.java
public class SchoolBus extends Vehicle {   // Inheritance: SchoolBus "is a" Vehicle
    private int capacity;

    public SchoolBus(String brand, int capacity) {
        super(brand);
        this.capacity = capacity;
    }

    public void loadStudents() {
        System.out.println("Loading up to " + capacity + " students");
    }
}
