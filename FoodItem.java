import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FoodItem {
    private String name;
    private int quantity;
    private String expirationDate;

    public FoodItem(String name, int quantity, String expirationDate) {
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiration Date: " + (expirationDate != null ? expirationDate : "Non-perishable"));
    }

    public boolean isExpired() {
        if (expirationDate == null) {
            return false;
        }
        try {
            LocalDate expDate = LocalDate.parse(expirationDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return expDate.isBefore(LocalDate.now());
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format for: " + name);
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}
//updated fooditem.java using stackoverflow research 