package chainedException;

class FileProcessingException extends Exception {
    public FileProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class FileApp {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                throw new FileProcessingException("Error while processing file.", e);
            }
        } catch (FileProcessingException e) {
            System.out.println("Custom Exception: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());
        }
    }
}
