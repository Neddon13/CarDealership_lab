package DealershipTest;

import Cars.Car;
import Cars.VehicleType;
import Components.Engine;
import Components.GearBox;
import Components.GearBoxType;
import Customer.Customer;
import Dealership.Dealer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;
    private ArrayList<Car> cars;
    private Car car;
    private Engine engine;
    private GearBox gearBox;
    private Customer customer;

    @Before
    public void before() {
        dealer = new Dealer("Bob", 50000);
        cars = new ArrayList<>();
        engine = new Engine(1.7);
        gearBox = new GearBox(GearBoxType.MANUAL, 6);
        customer = new Customer("John", 40000);
        car = new Car( "Volvo", "V50", "Blue", 7, 20000, engine, gearBox, VehicleType.ESTATE);
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

    @Test
    public void canAddToStock(){
        dealer.addToStock(car);
        assertEquals(1, dealer.getCountOfStock());
    }

    @Test
    public void canRepairVehicle() {
        dealer.repair(car, 2000);
        assertEquals(48000, dealer.getTill());
        assertEquals(22000, car.getPrice(), 0.0);
    }

    @Test
    public void canBuyCar(){
        dealer.buyCar(car);
        assertEquals(1, dealer.getCountOfStock());
        assertEquals(30000, dealer.getTill());
    }

    @Test
    public void canSellToCustomer(){
        dealer.sellCar(car, customer);
        assertEquals(0, dealer.getCountOfStock());
        assertEquals(70000, dealer.getTill());
        assertEquals(1, customer.getCollectionCount());
        assertEquals(20000, customer.getMoney());
    }
}
