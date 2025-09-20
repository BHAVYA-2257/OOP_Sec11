package abstractClasses;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class DynamicBindingDemo {
    public static void main(String[] args) {
        Animal a;  // Reference of superclass

        a = new Dog();  // Upcasting
        a.makeSound();  // Output: Dog barks

        a = new Cat();  // Reassignment
        a.makeSound();  // Output: Cat meows
    }
}
