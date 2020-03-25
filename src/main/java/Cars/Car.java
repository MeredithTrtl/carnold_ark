package Cars;

import Components.Engine;
import Components.Tyre;

public abstract class Car {

    private Engine engine;
    private Tyre tyre;
    private String name;
    private int price;

    public Car (Engine engine, Tyre tyre, String name, int price){
        this.engine = engine;
        this.tyre = tyre;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
