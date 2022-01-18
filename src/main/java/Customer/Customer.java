package Customer;

import java.util.ArrayList;
import java.util.Collection;

public class Customer {

    private String name;
    private int money;
    private ArrayList<Collection> collection;

    public Customer(String name, int money){
        this.name = name;
        this.money = money;
        collection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Collection> getCollection() {
        return collection;
    }
}
