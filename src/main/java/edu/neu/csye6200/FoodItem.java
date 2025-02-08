package edu.neu.csye6200;

public class FoodItem extends Item {
    private String type;

    public FoodItem(String csv) {
        String[] parts = csv.split(",");

        // Extract values first
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        double price = Double.parseDouble(parts[2]);

        // Call super() as the first statement
        super(id, name, price);

        this.type = parts[3]; // Set type after calling super
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + type + '\'' +
                '}';
    }
}
