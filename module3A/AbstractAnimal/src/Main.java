public class Main {

    public static void main(String[] args) {

        // Create a Mammal object
        Mammal dog = new Mammal();
        dog.setFurColor("Brown");
        System.out.println("Dog fur color: " + dog.getFurColor());
        dog.makeSound();
        dog.nurse();

        System.out.println();

        // Create a Bird object
        Bird eagle = new Bird();
        eagle.setWingSpan(2.5);
        System.out.println("Eagle wing span: " + eagle.getWingSpan() + " meters");
        eagle.makeSound();
        eagle.layEgg();
    }
}