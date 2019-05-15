package dealership.vehicles;

import dealership.Damage;
import dealership.components.Engine;

public class Diesel extends Vehicle {

    public Diesel(String make, int price, Engine engine, Damage damage) {
        super(make, price, engine, damage);
    }
}
