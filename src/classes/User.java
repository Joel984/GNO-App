package classes;

public class User {
    private String name;
    private ScannedHistory scannedHistory;

    // Constructor
    public User(String name) {
        this.name = name;
        this.scannedHistory = new ScannedHistory();
    }

    public String getName() {
        return name;
    }

    public ScannedHistory getScannedHistory() {
        return scannedHistory;
    }
}