package classes;
import java.util.ArrayList;
import java.util.List;

public class ScannedHistory {
    private List<ScannedObject> history;

    public ScannedHistory() {
        this.history = new ArrayList<>();
    }

    public void addScannedObject(ScannedObject object) {
        history.add(object);
    }

    public List<ScannedObject> getRecentObjects() {
        int size = history.size();
        return history.subList(Math.max(0, size - 5), size);
    }

    @Override
    public String toString() {
        return "Scanned History: " + history.toString();
    }
}