package classes;

public class ObjectScanner {
    public ScannedObject scan(String name, String brand, double price) {
        System.out.println("Scanning object...");
        return new ScannedObject(name, brand, price);
    }
}