import es.ulpgc.hpi.gno.*;


public class Main {
    public static void main(String[] args) {
        User user = new User("Pepe Hernández");
        ObjectScanner scanner = new ObjectScanner();

        ScannedHistory scannedHistory = new ScannedHistory();


        // Scanning objects
        ScannedObject object1 = new ScannedObject("AirPods (3rd generation)", "Apple", 149.00);
        ScannedObject object2 = new ScannedObject("DeathAdder V3 Pro", "Razer", 199.99);
        ScannedObject object3 = new ScannedObject("EF 50mm f/1.4 USM", "Canon", 419.99);

        // Adding to history
        scannedHistory.addScannedObject(object1);
        scannedHistory.addScannedObject(object2);
        scannedHistory.addScannedObject(object3);

        // Displaying history
        System.out.println("All Scanned Objects:");
        System.out.println(scannedHistory);

        // Displaying recent objects
        System.out.println("Recent Scanned Objects:");
        for (ScannedObject obj : scannedHistory.getRecentObjects()) {
            System.out.println(obj);
        }
    }
}