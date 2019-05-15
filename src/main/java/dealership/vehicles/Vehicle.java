package dealership.vehicles;

import dealership.Damage;
import dealership.components.Engine;

public abstract class Vehicle {

    private String make;
    private double price;
    private Engine engine;
    private Damage damage;
    private boolean rentable;
    private boolean purchasable;

    public Vehicle(String make, double price, Engine engine) {
        this.make = make;
        this.price = price;
        this.engine = engine;
        this.damage = null;
        this.rentable = false;
        this.purchasable = false;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isPurchasable() {
        return purchasable;
    }

    public void setPurchasable(boolean purchasable) {
        this.purchasable = purchasable;
    }

    public void updatePriceByDamage(){
        if (this.getDamage() == damage.WRITEOFF) {
            setPrice(0);
        } else {
            double percentage = ((double) damage.getPriceAdjustment() / 100d);
            double priceOfVehiclePrice = percentage * this.price;
            double newPrice = (this.price - priceOfVehiclePrice);
            setPrice(newPrice);
        }
    }
}
