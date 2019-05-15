import dealership.components.Tyre;
import dealership.components.TyreType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre(TyreType.ALLSEASON);
    }

    @Test
    public void hasType(){
        assertEquals(TyreType.ALLSEASON, tyre.getType());
    }


}
