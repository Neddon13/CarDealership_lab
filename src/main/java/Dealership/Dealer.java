package Dealership;

import Cars.Car;
import Customer.Customer;

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

    public void addToStock(Car car){
        this.cars.add(car);
    }

    public int getCountOfStock() {
        return cars.size();
    }

    public void repair(Car car, double cost) {
        this.till -= cost;
        car.repair(cost);
    }

    public void buyCar(Car car) {
        if (getTill() >= car.getPrice()) {
            addToStock(car);
            this.till -= car.getPrice();
        }
    }

    public void sellCar(Car car, Customer customer){
        this.cars.remove(car);
        customer.buyCar(car);
        this.till += car.getPrice();


    }
}
