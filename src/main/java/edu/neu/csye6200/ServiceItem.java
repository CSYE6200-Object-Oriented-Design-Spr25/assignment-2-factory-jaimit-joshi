package edu.neu.csye6200;

public class ServiceItem extends Item {
    private String timeframe;

    public ServiceItem(String csv) {
        String[] parts = csv.split(",");
        super(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]));
        this.timeframe = parts[3];
    }

    @Override
    public String toString() {
        return "ServiceItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", duration='" + timeframe + '\'' +
                '}';
    }
}