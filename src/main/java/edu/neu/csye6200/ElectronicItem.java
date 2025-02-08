package edu.neu.csye6200;

public class ElectronicItem extends Item {
    private String waaranty;

    public ElectronicItem(String csv) {
        String[] parts = csv.split(",");
        super(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]));
        this.waaranty = parts[3];
    }

    @Override
    public String toString() {
        return "ElectronicItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", warranty='" + waaranty + '\'' +
                '}';
    }
}