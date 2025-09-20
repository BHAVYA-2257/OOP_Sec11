package authenticationFailure;

class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

class LoginService {
    private String username = "admin";
    private String password = "12345";

    public void login(String user, String pass) throws AuthenticationException {
        if (!user.equals(username) || !pass.equals(password)) {
            throw new AuthenticationException("Login failed: Invalid credentials!");
        }
        System.out.println("Login successful!");
    }
}

public class LoginApp {
    public static void main(String[] args) {
        LoginService login = new LoginService();
        try {
            login.login("user", "wrongpass"); // wrong credentials
        } catch (AuthenticationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
