package ComponentsTest;

import org.junit.Before;
import Components.Tyres;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TyresTest {

    private Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres(22);
    }

    @Test
    public void hasTyreWidth() {
        assertEquals(22, tyres.getTyreWidth());
    }
}
