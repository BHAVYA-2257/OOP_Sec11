package tryCatchFinally;

public class NumberFormatExample {
    public static void main(String[] args) {
        try {
            String s = "abc";  
            int num = Integer.parseInt(s);  // Risky line
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed: Parsing attempt completed.");
        }

        System.out.println("Program continues...");
    }
}
