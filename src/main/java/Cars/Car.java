package Cars;

public abstract class Car {
    private String make;
    private String model;
    private int age;
    private int price;
    private String colour;
    VehicleType vehicleType;

    public Car(String make, String model, int age, int price, String colour, VehicleType vehicleType) {
        this.make = make;
        this.model = model;
        this.age = age;
        this.price = price;
        this.colour = colour;
        this.vehicleType = vehicleType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
