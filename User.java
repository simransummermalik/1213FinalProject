public class User {
    private String name;
    private String role; // "employee", "volunteer", or "donor"

    public User(String name, String role) {
        this.name = name;
        this.role = role.toLowerCase();
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void showInfo() {
        System.out.println("User: " + name + " (" + role + ")");
    }
}
