import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// Sample class to be inspected
class Employee {
    private int id;
    private String name;
    public double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee: " + id + ", " + name + ", " + salary);
    }

    private void calculateBonus() {
        System.out.println("Bonus: " + (salary * 0.1));
    }
}

public class ReflectionInspector {
    public static void main(String[] args) {
        try {    
    	// Load the class at runtime
            Class<?> clazz = Employee.class;

            System.out.println("Class Name: " + clazz.getName());

            // List all declared fields
            System.out.println("\nDeclared Fields:");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("  " + Modifier.toString(field.getModifiers()) + " " 
                                   + field.getType().getSimpleName() + " " + field.getName());
            }

            // List all declared methods
            System.out.println("\nDeclared Methods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("  " + Modifier.toString(method.getModifiers()) + " " 
                                   + method.getReturnType().getSimpleName() + " " + method.getName() + "()");
            } 
           }catch(Exception e) {e.printStackTrace();} 
        }
    }

