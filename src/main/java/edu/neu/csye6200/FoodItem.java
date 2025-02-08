package edu.neu.csye6200;

public class FoodItem extends Item {
    private String type;

    public FoodItem(String csv) {
        super(parseId(csv), parseName(csv), parsePrice(csv));
        this.type = parseType(csv);
    }

    private static int parseId(String csv) {
        return Integer.parseInt(csv.split(",")[0]);
    }

    private static String parseName(String csv) {
        return csv.split(",")[1];
    }

    private static double parsePrice(String csv) {
        return Double.parseDouble(csv.split(",")[2]);
    }

    private static String parseType(String csv) {
        return csv.split(",")[3];
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
