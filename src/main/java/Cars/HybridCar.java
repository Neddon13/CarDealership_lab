package Cars;

import Components.Engine;
import Components.GearBox;

public class HybridCar extends Cars{
    public HybridCar(String make, String model, String colour, int age, double price, Engine engine, GearBox gearBox, VehicleType vehicleType) {
        super(make, model, colour, age, price, engine, gearBox, vehicleType);
    }


}
