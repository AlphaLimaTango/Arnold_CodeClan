package dealership.vehicles;

import dealership.Damage;
import dealership.components.Engine;

public class Hybrid extends Vehicle {

    public Hybrid(String make, int price, Engine engine, Damage damage) {
        super(make, price, engine, damage);
    }
}
