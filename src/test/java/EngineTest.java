import dealership.components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1.8, 100);
    }

    @Test
    public void hasLitres(){
        assertEquals(1.8, engine.getLitres(), 0.01);
    }

    @Test
    public void hasBHP(){
        assertEquals(100, engine.getBhp());
    }
}
