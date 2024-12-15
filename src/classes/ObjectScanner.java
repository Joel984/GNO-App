package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectScanner {
    private List<ScannedObject> products;

    public ObjectScanner() {
        products = new ArrayList<>();
        initializeProducts();
    }

    private void initializeProducts() {
        Category techCategory = new Category("Technology");
        products.add(new ScannedObject("AirPods (3rd generation)", "Apple", 149.00));
        products.add(new ScannedObject("DeathAdder V3 Pro", "Razer", 199.99));
        products.add(new ScannedObject("Blender 5000", "Philips", 79.99));
        products.add(new ScannedObject("Gaming Chair", "Secretlab", 499.99));
        products.add(new ScannedObject("Coffee Maker", "De'Longhi", 99.99));
    }

    public ScannedObject scan() {
        System.out.println("Scanning object...");
        Category techCategory = new Category("Technology");
        Random random = new Random();
        int randomInt = random.nextInt(products.size());
        products.get(randomInt).setCategory(techCategory);
        return products.get(randomInt);
    }
}