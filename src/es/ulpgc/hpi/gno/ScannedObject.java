package es.ulpgc.hpi.gno;

public class ScannedObject {
    private String name;
    private String brand;
    private double price;

    public ScannedObject(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Brand: %s, Price: %.2f€",
                name, brand, price);
    }
}
