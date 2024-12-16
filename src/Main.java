import classes.AppController;
import classes.Category;
import classes.HistoryAnalytics;
import classes.ScannedObject;

public class Main {
    public static void main(String[] args) {
        AppController app = new AppController("Pepe Hernández");

        System.out.println("User: " + app.getUserName());

        app.scanAndAddObject();
        app.scanAndAddObject();
        app.scanAndAddObject();

        System.out.println("\nAll Scanned Objects:");
        app.printScannedHistory();

        app.scanAndAddObject();
        app.scanAndAddObject();

        app.printRecentScannedObjects();

        System.out.println("\nAnalytics Summary:");
        double averagePrice = HistoryAnalytics.calculateAveragePrice(app.getUserScannedHistory().getRecentObjects());
        ScannedObject mostExpensive = HistoryAnalytics.getMostExpensiveObject(app.getUserScannedHistory().getRecentObjects());
        ScannedObject leastExpensive = HistoryAnalytics.getLeastExpensiveObject(app.getUserScannedHistory().getRecentObjects());

        System.out.printf("Average Price: %.2f%n", averagePrice);
        System.out.println("Most Expensive Object: " + (mostExpensive != null ? mostExpensive : "None"));
        System.out.println("Least Expensive Object: " + (leastExpensive != null ? leastExpensive : "None"));
    }
}


