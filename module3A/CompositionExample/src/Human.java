// Human.java
public class Human {
    private String name;
    private Heart heart;   // Composition: Human owns the Heart

    public Human(String name) {
        this.name  = name;
        this.heart = new Heart();   // created inside — strong ownership
    }

    public void live() {
        System.out.println(name + " is alive");
        heart.beat();
    }
}