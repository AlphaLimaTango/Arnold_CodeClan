import dealership.Damage;
import dealership.components.Engine;
import dealership.vehicles.Petrol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolTest {
    Petrol petrol;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1.2, 100);
        petrol = new Petrol("Polo", 10, engine);
    }

    @Test
    public void hasMake(){
        assertEquals("Polo", petrol.getMake());
    }

    @Test
    public void hasPrice(){
        assertEquals(10, petrol.getPrice());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, petrol.getEngine());
    }

    @Test
    public void startsWithNullDamage(){
        assertEquals(null, petrol.getDamage());
    }

    @Test
    public void canSetDamage(){
        petrol.setDamage(Damage.LIGHT);
        assertEquals(Damage.LIGHT, petrol.getDamage());
    }

    @Test
    public void checkRentable(){
        assertEquals(false, petrol.isRentable());
    }

    @Test
    public void canSetRentable(){
        petrol.setRentable(true);
        assertEquals(true, petrol.isRentable());
    }

    @Test
    public void checkPurchasable(){
        assertEquals(false, petrol.isPurchasable());
    }

    @Test
    public void canSetPurchasable(){
        petrol.setPurchasable(true);
        assertEquals(true, petrol.isPurchasable());
    }
}
