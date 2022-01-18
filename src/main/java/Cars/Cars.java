package Cars;

import Components.Engine;
import Components.GearBox;

public abstract class Cars {
    private String make;
    private String model;
    private String colour;
    private int age;
    private double price;
    private Engine engine;
    private GearBox gearBox;
    private VehicleType vehicleType;

    public Cars(String make, String model, String colour, int age, double price, Engine engine, GearBox gearBox, VehicleType vehicleType) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.age = age;
        this.price = price;
        this.engine = engine;
        this.gearBox = gearBox;
        this.vehicleType = vehicleType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void damage(double cost) {
        this.price -= cost;
    }

    public void repair(double cost) {
        this.price += cost;
    }
}
