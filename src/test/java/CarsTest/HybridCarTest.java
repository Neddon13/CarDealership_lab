package CarsTest;

import Cars.HybridCar;
import Cars.VehicleType;
import Components.Engine;
import Components.GearBox;
import Components.GearBoxType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    private HybridCar car;

    @Before
    public void before(){
        Engine engine = new Engine(1.0);
        GearBox gearBox = new GearBox(GearBoxType.AUTOMATIC, 5);
        car = new HybridCar("Toyota", "Yaris", "Yellow", 1, 18000, engine, gearBox, VehicleType.SUV);
    }

    @Test
    public void hasHybridMake(){
        assertEquals("Toyota", car.getMake());
    }

    @Test
    public void hasHybridModel(){
        assertEquals("Yaris", car.getModel());
    }

    @Test
    public void hasHybridColour(){
        assertEquals("Yellow", car.getColour());
    }

    @Test
    public void hasHybridAge(){
        assertEquals(1, car.getAge());
    }

    @Test
    public void canDamage() {
        car.damage(5000);
        assertEquals(13000, car.getPrice(), 0.0);
    }

    @Test
    public void canRepair() {
        car.repair(5000);
        assertEquals(30000, car.getPrice(), 0.0);
    }
}
