import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your role (employee / volunteer / donor): ");
        String userRole = scanner.nextLine();

        User currentUser = new User(userName, userRole);
        System.out.println("\nWelcome, " + currentUser.getName() + "! Role: " + currentUser.getRole());


        while (true) {
            System.out.println("\nFood Inventory System");
            System.out.println("1. Add Food");
            System.out.println("2. Remove Food");
            System.out.println("3. Check Expired Items");
            System.out.println("4. Show Inventory");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter food name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter expiration date (YYYY-MM-DD) or press Enter for non-perishable: ");
                    String expirationDate = scanner.nextLine();
                    if (expirationDate.isEmpty()) {
                        expirationDate = null;
                    }
                    break;

                case 2:
                    System.out.print("Enter food name to remove: ");
                    String removeName = scanner.nextLine();

                    System.out.print("Enter quantity to remove: ");
                    int removeQuantity = scanner.nextInt();
                    scanner.nextLine();

                    inventory.removeFood(removeName, removeQuantity);
                    break;

                case 3:
                    inventory.checkExpired();
                    break;

                case 4:
                    inventory.showInventory();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}


               
                    