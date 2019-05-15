package dealership;

import dealership.vehicles.Diesel;
import dealership.vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> vehicles;
    private double till;

    public Dealership(double till) {
        this.vehicles = new ArrayList<>();
        this.till = till;
    }

    public int getNumberOfVehicles() {
        return this.vehicles.size();
    }

    public double getTill() {
        return this.till;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }
}
