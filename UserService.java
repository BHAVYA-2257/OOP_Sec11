package demoAnnotation;

@APIDescription(description = "This class handles user-related API operations")
public class UserService {

    @APIDescription(description = "Registers a new user with username and email")
    public void registerUser(String username, String email) {
        System.out.println("User registered: " + username + ", " + email);
    }

    @APIDescription(description = "Deletes an existing user by username")
    public void deleteUser(String username) {
        System.out.println("User deleted: " + username);
    }
}
