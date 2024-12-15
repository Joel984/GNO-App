import classes.AppController;
import classes.Category;
import classes.HistoryAnalytics;
import classes.ScannedObject;

public class Main {
    public static void main(String[] args) {
        // Instancia del controlador principal
        AppController app = new AppController("Pepe Hernández");

        // Mostrar nombre del usuario
        System.out.println("User: " + app.getUserName());

        // Escaneo y adición de objetos utilizando ObjectScanner
        app.scanAndAddObject();
        app.scanAndAddObject();
        app.scanAndAddObject();

        // Mostrar todos los objetos escaneados
        System.out.println("\nAll Scanned Objects:");
        app.printScannedHistory();

        // Adición de más objetos
        app.scanAndAddObject();
        app.scanAndAddObject();

        // Mostrar los últimos cinco objetos escaneados
        app.printRecentScannedObjects();

        // Usar HistoryAnalytics para analizar el historial completo
        System.out.println("\nAnalytics Summary:");
        double averagePrice = HistoryAnalytics.calculateAveragePrice(app.getUserScannedHistory().getRecentObjects());
        ScannedObject mostExpensive = HistoryAnalytics.getMostExpensiveObject(app.getUserScannedHistory().getRecentObjects());
        ScannedObject leastExpensive = HistoryAnalytics.getLeastExpensiveObject(app.getUserScannedHistory().getRecentObjects());

        // Mostrar los resultados del análisis
        System.out.printf("Average Price: %.2f%n", averagePrice);
        System.out.println("Most Expensive Object: " + (mostExpensive != null ? mostExpensive : "None"));
        System.out.println("Least Expensive Object: " + (leastExpensive != null ? leastExpensive : "None"));
    }
}


