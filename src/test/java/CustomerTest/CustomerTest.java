package CustomerTest;

import org.junit.Before;
import Customer.Customer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;

    @Before
    public void before() {
        customer = new Customer("Simon", 10000);
    }

    @Test
    public void hasName() {
        assertEquals("Simon", customer.getName());
    }

    @Test
    public void hasMoney() {
        assertEquals(10000, customer.getMoney());
    }

    @Test
    public void hasCollection() {
        assertEquals(0, customer.getCollection().size());
    }
}
