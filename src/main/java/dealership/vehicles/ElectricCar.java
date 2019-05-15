package dealership.vehicles;

import dealership.Damage;
import dealership.components.Engine;

public class ElectricCar extends Vehicle {

    public ElectricCar(String make, int price, Engine engine, Damage damage) {
        super(make, price, engine, damage);
    }
}
