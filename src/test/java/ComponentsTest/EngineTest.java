package ComponentsTest;

import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void before() {
        engine = new Engine(1.2);
    }

    @Test
    public void hasEngineSize(){
        assertEquals(1.2, engine.getSize(), 0.00);
    }


}
