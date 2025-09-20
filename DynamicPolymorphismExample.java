package dynamicPoly;

//Parent class
class Shape {
 void draw() {
     System.out.println("Drawing a shape");
 }
}

//Child class 1
class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Child class 2
class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

public class DynamicPolymorphismExample {
 public static void main(String[] args) {
     Shape s;  // Parent class reference

     s = new Circle();    // Upcasting
     s.draw();            // Calls Circle's draw() at runtime

     s = new Rectangle(); // Upcasting
     s.draw();            // Calls Rectangle's draw() at runtime
 }
}

