package dealership;

import dealership.vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> vehicles;
    private int till;

    public Dealership(ArrayList<Vehicle> vehicles, int till) {
        this.vehicles = new ArrayList<>();
        this.till = till;
    }
}
