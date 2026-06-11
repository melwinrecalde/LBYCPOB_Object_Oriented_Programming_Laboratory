// Duck.java
public class Duck implements Swimmable {   // Realization: fulfils the contract
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }

    @Override
    public boolean canDive() {
        return true;
    }
}