package tryCatchFinally;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block started.");

            // First risky code
            try {
                int a = 10, b = 0;
                int result = a / b;  // ArithmeticException
                System.out.println("Division Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println(" Inner Catch 1: " + e);
            }

            // Second risky code
            try {
                int[] arr = {1, 2, 3};
                System.out.println("Accessing 5th element: " + arr[5]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch 2: " + e);
            }

            // Third risky code
            try {
                String str = null;
                System.out.println("Length of string: " + str.length()); // NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Inner Catch 3: " + e);
            }

            System.out.println("Outer try block executed completely.");
        } catch (Exception e) {
            // Outer catch will handle anything not handled by inner ones
            System.out.println("Outer Catch (Unhandled Exception): " + e);
        } finally {
            System.out.println("Finally block executed (cleanup if needed).");
        }

        System.out.println("Program continues...");
    }
}
