import es.ulpgc.hpi.gno.*;

public class Main {
    public static void main(String[] args) {
        ObjectScanner scanner = new ObjectScanner();

        ScannedObject object1 = new ScannedObject("AirPods (3rd generation)", "Apple", 149.00);
        ScannedObject object2 = new ScannedObject("DeathAdder V3 Pro", "Razer", 199.99);
        ScannedObject object3 = new ScannedObject("EF 50mm f/1.4 USM", "Canon", 419.99);

        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);
    }
}