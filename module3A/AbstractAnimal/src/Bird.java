public class Bird extends Animal {

    private double wingSpan;

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird makes a sound");
    }

    public void layEgg() {
        System.out.println("Bird lays an egg");
    }
}