package dealership;

public enum Damage {

    WRITEOFF(100),
    HIGH(75),
    MODERATE(50),
    LIGHT(25);

    private final int priceAdjustment;

    Damage(int priceAdjustment) {
        this.priceAdjustment = priceAdjustment;
    }

    public int getPriceAdjustment(){
        return priceAdjustment;
    }
}
