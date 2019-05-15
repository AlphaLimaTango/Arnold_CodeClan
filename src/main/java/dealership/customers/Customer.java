package dealership.customers;

import dealership.Damage;
import dealership.vehicles.Diesel;
import dealership.vehicles.Vehicle;

public class Customer {

    private int age;
    private double money;
    private Vehicle vehicle;

    public Customer(int age, double money) {
        this.age = age;
        this.money = money;
        this.vehicle = null;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void inflictDamage(Vehicle vehicle, Damage damage) {
        vehicle.setDamage(damage);
    }
}
