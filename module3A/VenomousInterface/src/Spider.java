public class Spider implements Venomous {

    private int potency;

    public Spider(int potency) {
        this.potency = potency;
    }

    @Override
    public void injectVenom() {
        System.out.println("Spider bites and injects venom with potency: " + potency);
    }

    @Override
    public int getVenomPotency() {
        return potency;
    }
}