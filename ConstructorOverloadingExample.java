package staticPoly;

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter
    Student(String n) {
        name = n;
        age = 0;
    }

    // Constructor with two parameters
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Student s1 = new Student();             // Calls default constructor
        Student s2 = new Student("Alice");      // Calls 1-arg constructor
        Student s3 = new Student("Bob", 21);    // Calls 2-arg constructor

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
    }
}
