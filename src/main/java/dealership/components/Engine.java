package dealership.components;

public class Engine {

    private double litres;
    private int bhp;

    public Engine(double litres, int bhp) {
        this.litres = litres;
        this.bhp = bhp;
    }

    public double getLitres() {
        return litres;
    }

    public int getBhp() {
        return bhp;
    }
}
