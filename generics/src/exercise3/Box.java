package exercise3;

import java.util.LinkedList;

public class Box<T extends Bottle> {

    private LinkedList<T> bottles;

    public Box(){
        bottles = new LinkedList<>();
    }

    public void put(T beverage){
        bottles.addLast(beverage);
    }

    public LinkedList<T> getBottles() {
        return new LinkedList<>(bottles);
    }
}
