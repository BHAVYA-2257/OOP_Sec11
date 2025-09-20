package tryCatchFinally;

public class DivideByZeroExample {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;   // Risky line of Code
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed: Division attempt completed.");
        }

        System.out.println("Program continues...");
    }
}
