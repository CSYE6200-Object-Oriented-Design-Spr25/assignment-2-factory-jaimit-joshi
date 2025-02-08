package edu.neu.csye6200;

public class FoodItem extends Item {
    private String type;

    public FoodItem(String csv) {
        String[] parts = csv.split(",");
        super(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]));
        this.type = parts[3];
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