package Dealership;

import Cars.Car;

import java.util.ArrayList;

public class Dealer {

    private String name;
    private ArrayList<Car> cars;
    private int till;

    public Dealer(String name, int till) {
        this.name = name;
        this.till = till;
        cars = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }
    
    public int getTill() {
        return till;
    }
    
    public ArrayList<Car> getCars() {
        return cars;
    }
}
