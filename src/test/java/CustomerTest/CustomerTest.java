package CustomerTest;

import Cars.Car;
import Cars.VehicleType;
import Components.Engine;
import Components.GearBox;
import Components.GearBoxType;
import org.junit.Before;
import Customer.Customer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;
    private Car car;
    private Engine engine;
    private GearBox gearBox;

    @Before
    public void before() {
        customer = new Customer("Simon", 20000);
        engine = new Engine(1.7);
        gearBox = new GearBox(GearBoxType.MANUAL, 6);
        car = new Car("Volvo", "V50", "Blue", 7, 20000, engine, gearBox, VehicleType.ESTATE);
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
        assertEquals(0, customer.getCollectionCount());
    }

    @Test
    public void canGetCountOfCollection(){
        customer.addCar(car);
        assertEquals(1, customer.getCollectionCount());
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(car);
        assertEquals(1, customer.getCollectionCount());
        assertEquals(0, customer.getMoney());
    }
}
