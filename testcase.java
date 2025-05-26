public class testcase {
    public static void main(String[] args) {
        // 1
        System.out.println("MILK TEST");
        FoodItem milk = new FoodItem("Milk", 3, "2025-06-10");
        milk.showInfo();
        System.out.println("Is Milk expired? " + milk.isExpired());

        // 2 
        System.out.println("EGG TEST");
        FoodItem eggs = new FoodItem("Eggs", 6, "2023-01-01");
        eggs.showInfo();
        System.out.println("Are Eggs expired? " + eggs.isExpired());
    }
}
