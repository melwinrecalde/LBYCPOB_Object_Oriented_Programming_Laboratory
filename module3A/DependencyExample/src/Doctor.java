// Doctor.java
public class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    // Dependency: Syringe is used only for this method call, never stored
    public void treat(Syringe syringe) {
        System.out.println(name + " administers " + syringe.getMedicine());
    }
}