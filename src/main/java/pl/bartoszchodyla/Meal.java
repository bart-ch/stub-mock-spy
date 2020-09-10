package pl.bartoszchodyla;

/**
 * Created by "Bartosz Chodyla" on 2020-09-10.
 */
public class Meal {
    private int price;
    private int quantity;
    private String name;

    public Meal() {
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    int sumPrice() {
        return getPrice() * getQuantity();
    }
}
