package Components;

public class GearBox {

    private GearBoxType gearBoxType;
    private int numberOfGears;

    public GearBox(GearBoxType gearBoxType, int numberOfGears) {
        this.gearBoxType = gearBoxType;
        this.numberOfGears = numberOfGears;
    }

    public GearBoxType getGearBoxType() {
        return gearBoxType;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }
}
