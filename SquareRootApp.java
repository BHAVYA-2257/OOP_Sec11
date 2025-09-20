package customExceptions;

//Step 1: Create RuntimeException subclass
class NegativeNumberException extends RuntimeException {
 public NegativeNumberException(String message) {
     super(message);
 }
}

//Step 2: Use Custom Exception
public class SquareRootApp {
 public static double findSquareRoot(int number) {
     if (number < 0) {
         throw new NegativeNumberException("Cannot find square root of negative number!");
     }
     return Math.sqrt(number);
 }

 public static void main(String[] args) {
     try {
         System.out.println(findSquareRoot(-25));
     } catch (NegativeNumberException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}
