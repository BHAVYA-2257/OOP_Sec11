package abstractClasses;

abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("Displaying shape...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();       // Output: Drawing a Circle
        c.display();    // Output: Displaying shape...
    }
}
