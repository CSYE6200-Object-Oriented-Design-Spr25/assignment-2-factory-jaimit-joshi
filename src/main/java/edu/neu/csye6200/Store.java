package edu.neu.csye6200;

import java.util.*;

public class Store extends AbstractStore {
    @Override
    public void loadItems() {
        // Load FoodItems
        List<String> foodLines = FileUtil.readLines("src/main/java/FoodItemCSV.txt");
        for (String line : foodLines) {
            items.add(FoodItemFactory.createFoodItem(line));
        }

        // Load ElectronicItems
        List<String> electronicLines = FileUtil.readLines("src/main/java/ElectronicItemCSV.txt");
        for (String line : electronicLines) {
            items.add(ElectronicItemFactory.getInstance().createElectronicItem(line));
        }

        // Load ServiceItems
        List<String> serviceLines = FileUtil.readLines("src/main/java/ServiceItemCSV.txt");
        for (String line : serviceLines) {
            items.add(ServiceItemFactory.getInstance().createServiceItem(line));
        }
    }

    @Override
    public void sortItemsById() {
        items.sort(Comparator.comparingInt(item -> item.id));
    }

    @Override
    public void sortItemsByName() {
        items.sort(Comparator.comparing(item -> item.name));
    }

    @Override
    public void sortItemsByPrice() {
        items.sort(Comparator.comparingDouble(item -> item.price));
    }

    public void demo() {
        loadItems();

        System.out.println("Sorted by ID:");
        sortItemsById();
        displayItems();
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("\nSorted by Name:");
        sortItemsByName();
        displayItems();
        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println("\nSorted by Price:");
        sortItemsByPrice();
        displayItems();
    }
}