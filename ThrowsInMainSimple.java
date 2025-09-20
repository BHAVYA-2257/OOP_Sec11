package throwANDthrowsDemonstration;

public class ThrowsInMainSimple {
    // main declares that it may throw ArithmeticException
    public static void main(String[] args) throws ArithmeticException {
        divide(10, 0);   // risky call → exception will be thrown
        System.out.println("Program continues..."); // won't execute if exception occurs
    }

    static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        System.out.println("Result: " + (a / b));
    }
}
