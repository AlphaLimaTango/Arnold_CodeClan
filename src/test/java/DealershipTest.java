import dealership.Dealership;
import dealership.components.Engine;
import dealership.vehicles.Diesel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Diesel diesel1;
    Diesel diesel2;
    Engine engine;

    @Before
    public void before(){
        dealership = new Dealership(100.00);
        engine = new Engine(2.0, 150);
        diesel1 = new Diesel("VW", 100, engine);
        diesel2 = new Diesel("VW", 100, engine);
    }

    @Test
    public void canGetVehicleAmount() {
        assertEquals(0, dealership.getNumberOfVehicles());
    }

    @Test
    public void canGetTill(){
        assertEquals(100.00, dealership.getTill(), 0.01);
    }

    @Test
    public void canAddVehicle(){
        dealership.addVehicle(diesel1);
        assertEquals(1, dealership.getNumberOfVehicles());
    }

    @Test
    public void canRemoveVehicle(){
        dealership.addVehicle(diesel1);
        dealership.addVehicle(diesel2);
        dealership.removeVehicle(diesel1);
        assertEquals(1, dealership.getNumberOfVehicles());
    }


}
