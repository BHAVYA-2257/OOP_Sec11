package throwANDthrowsDemonstration;
public class ThrowExample {
    public static void main(String[] args) {
        try {
            validateAge(15);  // underage
        } catch (ArithmeticException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        }
    }

    // throw used to explicitly throw exception
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied – Age must be 18 or above!");
        }
        System.out.println("✅ Access granted – Age verified.");
    }
}
