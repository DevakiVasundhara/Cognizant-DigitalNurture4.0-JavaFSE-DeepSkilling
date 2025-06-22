
import java.util.HashMap;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return productId + ": " + productName + ", Qty: " + quantity + ", Price: " + price;
    }
}

public class Exercise1_InventoryManagement {
    static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    public static void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.quantity = quantity;
            p.price = price;
        }
    }

    public static void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    public static void displayInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        addProduct(new Product(1, "Laptop", 10, 50000));
        addProduct(new Product(2, "Phone", 20, 15000));
        updateProduct(1, 15, 48000);
        deleteProduct(2);
        displayInventory();
    }
}
