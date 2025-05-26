import java.util.ArrayList;

public class Inventory {
    private final ArrayList<FoodItem> inventory;

    // Constructor to initialize the inventory
    public Inventory() {
        inventory = new ArrayList<>();
    }

    // Method to add food item
    public void addFood(FoodItem item) {
    inventory.add(item);
    System.out.println(item.getName() + " added to inventory.");
    System.out.println("Inventory size after adding: " + inventory.size());
}


    // Method to remove food item by name and quantity
    public void removeFood(String name, int quantity) {
        for (int i = 0; i < inventory.size(); i++) {
            FoodItem item = inventory.get(i);
            if (item.getName().equalsIgnoreCase(name)) {
                if (item.getQuantity() >= quantity) {
                    item.setQuantity(item.getQuantity() - quantity);
                    System.out.println(quantity + " of " + name + " removed.");
                    // If the quantity is 0, remove the item from the inventory
                    if (item.getQuantity() == 0) {
                        inventory.remove(i);
                        System.out.println(name + " is now out of stock and removed from inventory.");
                    }
                } else {
                    System.out.println("Not enough quantity to remove.");
                }
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Method to check for expired items
    public void checkExpired() {
        System.out.println("Checking for expired food items...");
        boolean hasExpired = false;

        // Iterate through inventory and check for expired items
        for (FoodItem item : inventory) {
            if (item.isExpired()) {
                System.out.println("WARNING: " + item.getName() + " expired on " + item.getExpirationDate());
                hasExpired = true;
            }
        }

        // If no expired items, notify the user
        if (!hasExpired) {
            System.out.println("No expired items found.");
        }
    }

    // Method to show the inventory
    public void showInventory() {
    if (inventory.isEmpty()) {
        System.out.println("Inventory is empty.");
        return;
    }

    System.out.println("Current Inventory:");
    for (FoodItem item : inventory) {
        System.out.println(item.getName() + " - Quantity: " + item.getQuantity());
    }
}

}
