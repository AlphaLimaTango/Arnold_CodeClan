package dealership.vehicles;

import dealership.Damage;
import dealership.components.Engine;

public class Petrol extends Vehicle {

    public Petrol(String make, int price, Engine engine, Damage damage) {
        super(make, price, engine, damage);
    }
}
