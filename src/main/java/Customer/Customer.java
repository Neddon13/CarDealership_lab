package Customer;

import java.util.ArrayList;
import java.util.Collection;
import Cars.Car;

public class Customer {

    private String name;
    private int money;
    private ArrayList<Car> collection;
    private Car car;


    public Customer(String name, int money){
        this.name = name;
        this.money = money;
        this.collection = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Car> getCollection() {
        return collection;
    }

    public int getCollectionCount(){
        return collection.size();
    }

    public void addCar(Car car){
        this.collection.add(car);
    }


    public void buyCar(Car car) {
        if (getMoney() >= car.getPrice()) {
            addCar(car);
            this.money -= car.getPrice();
        }
    }
}
