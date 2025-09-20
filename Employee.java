package scenario4;

//Step 2. Sample class with annotation

@DebugInfo("Class representing an Employee entity")
class Employee {

 @DebugInfo("Unique employee ID")
 private int id;

 @DebugInfo("Name of the employee")
 private String name;

 public Employee(int id, String name) {
     this.id = id;
     this.name = name;
 }

 @DebugInfo("Displays employee details")
 public void displayInfo() {
     System.out.println("Employee ID: " + id + ", Name: " + name);
 }
}

