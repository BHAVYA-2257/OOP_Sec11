package throwANDthrowsDemonstration;

import java.io.IOException;

public class Throws_Example {
    public static void main(String[] args) {
        try {
            readFile("test.txt"); // risky call
        } catch (IOException e) {
            System.out.println("❌ Exception caught: " + e.getMessage());
        }
    }

    // throws used to declare checked exception
    static void readFile(String fileName) throws IOException {
        if (!fileName.equals("data.txt")) {
            throw new IOException("File not found: " + fileName);
        }
        System.out.println("✅ File read successfully.");
    }
}
