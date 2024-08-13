// UserAuth.java
public class UserAuth {
    private static UserAuth instance;
    private String username;

    // Private constructor to prevent instantiation
    private UserAuth() {}

    // Method to get the singleton instance
    public static UserAuth getInstance() {
        if (instance == null) {
            instance = new UserAuth();
        }
        return instance;
    }

    // Method to log in the user
    public void login(String username) {
        this.username = username;
        System.out.println(username + " logged in successfully.");
    }

    // Method to get the username
    public String getUsername() {
        return username;
    }
}
