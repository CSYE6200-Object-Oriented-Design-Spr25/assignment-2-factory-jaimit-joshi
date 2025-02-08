package edu.neu.csye6200;

public class ElectronicItem extends Item {
    private String warranty;

    public ElectronicItem(String csv) {
        super(parseId(csv), parseName(csv), parsePrice(csv));
        this.warranty = parseWarranty(csv);
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

    private static String parseWarranty(String csv) {
        return csv.split(",")[3];
    }

    @Override
    public String toString() {
        return "ElectronicItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", warranty='" + warranty + '\'' + // Fixed typo
                '}';
    }
}
