package teachers;
import java.util.Scanner;


public class Teachers {
    static int counter = 0;  // static counter to generate unique IDs
    int id;
    String name;
    String subject;

    public Teachers(String name, String subject) {
        counter++;           // increment counter for each new teacher
        this.id = counter;   // assign unique ID
        this.name = name;
        this.subject = subject;
        displayDetails();
    }

    public void displayDetails() {
        System.out.println("Teacher ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume the leftover newline

        Teachers[] teachers = new Teachers[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for teacher " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            teachers[i] = new Teachers(name, subject);
        }

        sc.close();
    }
}
