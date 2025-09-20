package demoReflection;

//File: InventorySystem.java
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class InventorySystem {
 public static void main(String[] args) {
     try {
         // Load the Product class dynamically (by fully qualified name)
         Class<?> clazz = Class.forName("demoReflection.Product");

         // Get constructor that accepts (String, double)
         Constructor<?> constructor = clazz.getConstructor(String.class, double.class);

         // Create a new instance dynamically
         Object productInstance = constructor.newInstance("Laptop", 75000.0);

         // Get showDetails() method
         Method method = clazz.getMethod("showDetails");

         // Invoke the method
         method.invoke(productInstance);

     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

