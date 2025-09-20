package validation;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

class Student {
    public void setMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
        System.out.println("Marks recorded: " + marks);
    }
}

public class MarksApp {
    public static void main(String[] args) {
        Student s1 = new Student();
        try {
            s1.setMarks(120); // invalid marks
        } catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
