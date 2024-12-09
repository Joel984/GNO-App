package es.ulpgc.hpi.gno;

import java.util.List;

public class HistoryAnalytics {

    public static double calculateAveragePrice(List<ScannedObject> objects) {
        if (objects.isEmpty()) return 0.0;
        double total = 0.0;
        for (ScannedObject obj : objects) {
            total += obj.getPrice();
        }
        return total / objects.size();
    }

    public static ScannedObject getMostExpensiveObject(List<ScannedObject> objects) {
        if (objects.isEmpty()) return null;
        ScannedObject mostExpensive = objects.get(0);
        for (ScannedObject obj : objects) {
            if (obj.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = obj;
            }
        }
        return mostExpensive;
    }

    public static ScannedObject getLeastExpensiveObject(List<ScannedObject> objects) {
        if (objects.isEmpty()) return null;
        ScannedObject leastExpensive = objects.get(0);
        for (ScannedObject obj : objects) {
            if (obj.getPrice() < leastExpensive.getPrice()) {
                leastExpensive = obj;
            }
        }
        return leastExpensive;
    }

}

