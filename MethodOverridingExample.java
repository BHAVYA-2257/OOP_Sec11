package dynamicPoly;

//Parent class
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class
class Dog extends Animal {
 // Overriding the parent class method
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

//Another Child class
class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Cat meows");
 }
}

public class MethodOverridingExample {
 public static void main(String[] args) {
     Animal a1 = new Dog();  // Runtime: Dog's sound() is called
     Animal a2 = new Cat();  // Runtime: Cat's sound() is called
     Animal a3 = new Animal(); // Calls Animal's sound()

     a1.sound();  
     a2.sound();  
     a3.sound();  
 }
}
