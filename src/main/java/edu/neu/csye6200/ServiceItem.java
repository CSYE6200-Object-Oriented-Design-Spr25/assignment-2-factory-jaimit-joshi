package edu.neu.csye6200;

public class ServiceItem extends Item {
    private String timeframe;

    public ServiceItem(String csv) {
        super(parseId(csv), parseName(csv), parsePrice(csv));
        this.timeframe = parseTimeframe(csv);
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

    private static String parseTimeframe(String csv) {
        return csv.split(",")[3];
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
