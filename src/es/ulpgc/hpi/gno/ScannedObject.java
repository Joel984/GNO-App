package es.ulpgc.hpi.gno;

public class ScannedObject {
    private String name;
    private String brand;
    private double price;
    private Category category;

    public ScannedObject(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.category = null;
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

    public Category getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Brand: %s, Price: %.2f€, Category: %s",
                name, brand, price, (category != null ? category : "Uncategorized"));
    }
}
