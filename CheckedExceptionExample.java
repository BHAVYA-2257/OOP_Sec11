package throwANDthrowsDemonstration;

import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            checkFile("notes.txt");  // risky call
        } catch (IOException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }

    // Checked exception → must declare throws
    static void checkFile(String fileName) throws IOException {
        if (!fileName.equals("data.txt")) {
            throw new IOException("File not found: " + fileName);
        }
        System.out.println("File found: " + fileName);
    }
}
