public class Scorpion implements Venomous {

    private double stingerLength;
    private int potency;

    public Scorpion(double stingerLength, int potency) {
        this.stingerLength = stingerLength;
        this.potency = potency;
    }

    @Override
    public void injectVenom() {
        System.out.println("Scorpion stings with stinger length " +
                stingerLength +
                " cm and injects venom potency: " +
                potency);
    }

    @Override
    public int getVenomPotency() {
        return potency;
    }
}