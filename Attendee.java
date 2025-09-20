package superKeyword;

class Person {
    String name;

    // Parent class constructor
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }

    void showDetails() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int id;
    String course;

    // Child class constructor using super() to call parent constructor
    Student(int id, String name, String course) {
        super(name); // Calling parent constructor
        this.id = id;
        this.course = course;
        System.out.println("Student constructor called");
    }

    void display() {
        super.showDetails(); // Calling parent method
        System.out.println("ID: " + id + ", Course: " + course);
    }
}
public class Attendee {
	 public static void main(String[] args) {
	        Student s = new Student(101, "Alice", "Java Programming");
	        s.display();
  }
}