package classes;

public class AppController {
    private User user;
    private ObjectScanner scanner;

    public AppController(String userName) {
        this.user = new User(userName);
        this.scanner = new ObjectScanner();
    }

    public String getUserName() {
        return user.getName();
    }

    public void scanAndAddObject() {
        ScannedObject object = scanner.scan();
        user.getScannedHistory().addScannedObject(object);
    }


    public void printScannedHistory() {
        for (ScannedObject object : user.getScannedHistory().getRecentObjects()) {
            System.out.println(object);
        }
    }

    public void printRecentScannedObjects() {
        System.out.println("\nRecent Scanned Objects:");
        for (ScannedObject object : user.getScannedHistory().getRecentObjects()) {
            System.out.println(object);
        }
    }

    public ScannedHistory getUserScannedHistory() {
        return user.getScannedHistory();
    }
}
