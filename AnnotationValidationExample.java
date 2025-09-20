package scenarioCustomValidation;

//Step 4: Test the validation

public class AnnotationValidationExample {
 public static void main(String[] args) {
     Customer c1 = new Customer("", "customer1@email.com");
     Customer c2 = new Customer("Alice", "alice@email.com");

     System.out.println("Validating Customer 1:");
     Validator.validate(c1);

     System.out.println("\nValidating Customer 2:");
     Validator.validate(c2);
 }
}