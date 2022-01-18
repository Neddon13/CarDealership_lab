package DealershipTest;

import Dealership.Dealer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;

    @Before
    public void before() {
        dealer = new Dealer("Bob", 50000);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", dealer.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(50000, dealer.getTill());
    }

    @Test
    public void hasCars() {
        assertEquals(0, dealer.getCars().size());
    }
}
