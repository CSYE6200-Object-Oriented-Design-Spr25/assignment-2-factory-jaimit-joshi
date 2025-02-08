package edu.neu.csye6200;

public class FoodItemFactory {
    public static FoodItem createFoodItem(String csv) {
        return new FoodItem(csv);
    }
}