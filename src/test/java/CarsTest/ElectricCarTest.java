package CarsTest;

import Cars.VehicleType;
import Components.Engine;
import Components.GearBox;
import Components.GearBoxType;
import org.junit.Before;
import Cars.ElectricCar;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ElectricCarTest {

    private ElectricCar car;

    @Before
    public void before() {
        Engine engine = new Engine(2);
        GearBox gearBox = new GearBox(GearBoxType.MANUAL, 6);
        car = new ElectricCar("Hyundai", "Ioniq 5", "Blue", 5, 40000, engine, gearBox, VehicleType.HATCHBACK);
    }

    @Test
    public void hasMake() {
        assertEquals("Hyundai", car.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Ioniq 5", car.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void hasAge() {
        assertEquals(5, car.getAge());
    }

    @Test
    public void hasPrice() {
        assertEquals(40000, car.getPrice(), 0.0);
    }

    @Test
    public void hasEngine() {
        assertTrue(car.getEngine() instanceof Engine);
    }

    @Test
    public void hasGearBox() {
        assertTrue(car.getGearBox() instanceof GearBox);
    }

    @Test
    public void hasVehicleType() {
        assertEquals(VehicleType.HATCHBACK, car.getVehicleType());
    }

    @Test
    public void canDamage() {
        car.damage(5000);
        assertEquals(35000, car.getPrice(), 0.0);
    }

    @Test
    public void canRepair() {
        car.repair(5000);
        assertEquals(30000, car.getPrice(), 0.0);
    }
}
