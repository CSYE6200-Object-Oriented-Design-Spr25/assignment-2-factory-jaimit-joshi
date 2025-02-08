package edu.neu.csye6200;

import java.util.ArrayList; // Import the ArrayList class
import java.util.List;

public abstract class AbstractStore {
    protected List<Item> items;

    public AbstractStore() {
        this.items = new ArrayList<>();
    }

    public abstract void loadItems();
    public abstract void sortItemsById();
    public abstract void sortItemsByName();
    public abstract void sortItemsByPrice();

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}