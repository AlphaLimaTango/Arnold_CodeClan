import dealership.Damage;
import dealership.components.Engine;
import dealership.vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar electricCar;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1.2, 100);
        electricCar = new ElectricCar("Polo", 10, engine);
    }

    @Test
    public void hasMake(){
        assertEquals("Polo", electricCar.getMake());
    }

    @Test
    public void hasPrice(){
        assertEquals(10, electricCar.getPrice());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, electricCar.getEngine());
    }

    @Test
    public void startsWithNullDamage(){
        assertEquals(null, electricCar.getDamage());
    }

    @Test
    public void canSetDamage(){
        electricCar.setDamage(Damage.LIGHT);
        assertEquals(Damage.LIGHT, electricCar.getDamage());
    }

    @Test
    public void checkRentable(){
        assertEquals(false, electricCar.isRentable());
    }

    @Test
    public void canSetRentable(){
        electricCar.setRentable(true);
        assertEquals(true, electricCar.isRentable());
    }

    @Test
    public void checkPurchasable(){
        assertEquals(false, electricCar.isPurchasable());
    }

    @Test
    public void canSetPurchasable(){
        electricCar.setPurchasable(true);
        assertEquals(true, electricCar.isPurchasable());
    }
}
