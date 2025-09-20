package demoReflection;

//File: Product.java
public class Product {
 private String name;
 private double price;

 // Constructor
 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }

 // Method to display details
 public void showDetails() {
     System.out.println("Product Name: " + name + ", Price: $" + price);
 }
}
