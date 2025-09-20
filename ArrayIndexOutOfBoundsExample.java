package tryCatchFinally;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            // Risky code: which may throw an exception
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Exception handling block
            System.out.println("❌ Exception caught: " + e);
        } finally {
            // Always executes (whether exception occurs or not)
            System.out.println("✅ Finally block executed: Closing resources or cleanup tasks.");
        }

        System.out.println("Program continues after try-catch-finally...");
    }
}
