package tryCatchFinally;

public class NullPointerExample {
     	public static void main(String[] args) {
        try {
        	String str = null;
            System.out.println("Length: " + str.length());  // Risky line
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed: Null check done.");
        }

        System.out.println("Program continues...");
    }
}
