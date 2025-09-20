package multipleExceptions;


//Custom Exception 1
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Custom Exception 2
class InvalidAccountException extends Exception {
 public InvalidAccountException(String message) {
     super(message);
 }
}

class BankAccount {
 private String accountNumber;
 private double balance;

 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public void withdraw(double amount) throws InsufficientFundsException {
     if (amount > balance) {
         throw new InsufficientFundsException("Withdrawal failed: Insufficient balance!");
     }
     balance -= amount;
     System.out.println("Withdrawal successful. Remaining balance: " + balance);
 }

 public void checkAccount(String acc) throws InvalidAccountException {
     if (!acc.equals(accountNumber)) {
         throw new InvalidAccountException("Invalid account number!");
     }
     System.out.println("Account verified.");
 }
}

public class BankingApp {
 public static void main(String[] args) {
     BankAccount account = new BankAccount("12345", 5000);

     try {
         account.checkAccount("54321");  // wrong account number
         account.withdraw(6000);        // insufficient funds
     } catch (InvalidAccountException | InsufficientFundsException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
