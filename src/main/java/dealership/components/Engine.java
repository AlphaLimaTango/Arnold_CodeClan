package dealership.components;

public class Engine {

    private int litres;
    private int bhp;

    public Engine(int litres, int bhp) {
        this.litres = litres;
        this.bhp = bhp;
    }

    public int getLitres() {
        return litres;
    }

    public int getBhp() {
        return bhp;
    }
}
