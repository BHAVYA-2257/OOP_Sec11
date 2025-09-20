package designPatterns;

//Step 1: Strategy Interface
interface PaymentStrategy {
 void pay(double amount);
}

//Step 2: Concrete Strategies
class CreditCardPayment implements PaymentStrategy {
 private String cardNumber;

 public CreditCardPayment(String cardNumber) {
     this.cardNumber = cardNumber;
 }

 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
 }
}

class PayPalPayment implements PaymentStrategy {
 private String email;

 public PayPalPayment(String email) {
     this.email = email;
 }

 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " via PayPal account: " + email);
 }
}

class UpiPayment implements PaymentStrategy {
 private String upiId;

 public UpiPayment(String upiId) {
     this.upiId = upiId;
 }

 public void pay(double amount) {
     System.out.println("Paid ₹" + amount + " via UPI ID: " + upiId);
 }
}

//Step 3: Context
class Checkout {
 private PaymentStrategy paymentStrategy;

 public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
     this.paymentStrategy = paymentStrategy;
 }

 public void processOrder(double amount) {
     paymentStrategy.pay(amount);
 }
}

//Step 4: Client Code
public class ECommercePaymentExample {
 public static void main(String[] args) {
     Checkout checkout = new Checkout();

     // Pay with Credit Card
     checkout.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
     checkout.processOrder(2500.00);

     // Pay with PayPal
     checkout.setPaymentStrategy(new PayPalPayment("user@example.com"));
     checkout.processOrder(3200.00);

     // Pay with UPI
     checkout.setPaymentStrategy(new UpiPayment("9876543210@upi"));
     checkout.processOrder(1500.00);
 }
}
