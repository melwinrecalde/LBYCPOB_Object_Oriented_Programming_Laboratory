public class Main {

    public static void main(String[] args) {

        // Create a Spider object
        Spider blackWidow = new Spider(7);
        System.out.println("Spider:");
        System.out.println("Venom potency: " + blackWidow.getVenomPotency());
        blackWidow.injectVenom();

        System.out.println();

        // Create a Scorpion object
        Scorpion emperorScorpion = new Scorpion(3.2, 9);
        System.out.println("Scorpion:");
        System.out.println("Venom potency: " + emperorScorpion.getVenomPotency());
        emperorScorpion.injectVenom();

        System.out.println();
    }
}