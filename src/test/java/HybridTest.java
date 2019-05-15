import dealership.Damage;
import dealership.components.Engine;
import dealership.vehicles.Hybrid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {
    Hybrid hybrid;
    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1.2, 100);
        hybrid = new Hybrid("Polo", 10, engine);
    }

    @Test
    public void hasMake(){
        assertEquals("Polo", hybrid.getMake());
    }

    @Test
    public void hasPrice(){
        assertEquals(10, hybrid.getPrice());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, hybrid.getEngine());
    }

    @Test
    public void startsWithNullDamage(){
        assertEquals(null, hybrid.getDamage());
    }

    @Test
    public void canSetDamage(){
        hybrid.setDamage(Damage.LIGHT);
        assertEquals(Damage.LIGHT, hybrid.getDamage());
    }

    @Test
    public void checkRentable(){
        assertEquals(false, hybrid.isRentable());
    }

    @Test
    public void canSetRentable(){
        hybrid.setRentable(true);
        assertEquals(true, hybrid.isRentable());
    }

    @Test
    public void checkPurchasable(){
        assertEquals(false, hybrid.isPurchasable());
    }

    @Test
    public void canSetPurchasable(){
        hybrid.setPurchasable(true);
        assertEquals(true, hybrid.isPurchasable());
    }
}
