package Cars;

import Components.Engine;
import Components.GearBox;

public class Car extends Cars {
    public Car(String make, String model, String colour, int age, double price, Engine engine, GearBox gearBox, VehicleType vehicleType) {
        super(make, model, colour, age, price, engine, gearBox, vehicleType);
    }
}
