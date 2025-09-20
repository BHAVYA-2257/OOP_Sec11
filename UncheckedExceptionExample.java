package throwANDthrowsDemonstration;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            divide(10, 0);   // risky call
        } catch (ArithmeticException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }

    // Here throw is used, but throws is NOT required (unchecked exception)
    static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        System.out.println("Result: " + (a / b));
    }
}
