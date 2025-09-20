package customExceptions;

//Step 1: Create a Custom Exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}
//Step 2: Use Custom Exception
public class VotingApp {
 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or above to vote!");
     } else {
         System.out.println("You are eligible to vote.");
     }
 }
 public static void main(String[] args) {
     try {
         checkAge(16);  // Will throw custom exception
     } catch (InvalidAgeException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}
