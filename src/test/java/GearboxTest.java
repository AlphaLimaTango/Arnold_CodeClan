import dealership.components.GearType;
import dealership.components.Gearbox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GearboxTest {

    Gearbox gearbox;

    @Before
    public void before(){
        gearbox = new Gearbox(GearType.AUTOMATIC);
    }

    @Test
    public void hasType(){
        assertEquals(GearType.AUTOMATIC, gearbox.getType());
    }
}
