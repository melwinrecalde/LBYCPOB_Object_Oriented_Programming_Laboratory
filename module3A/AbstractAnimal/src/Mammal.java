public class Mammal extends Animal {

    private String furColor;

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal makes a sound");
    }

    public void nurse() {
        System.out.println("Mammal is nursing its young");
    }
}