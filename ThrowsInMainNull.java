package throwANDthrowsDemonstration;
public class ThrowsInMainNull {
    public static void main(String[] args) throws NullPointerException {
        printLength(null);   // risky call
        System.out.println("Program continues..."); // won't run if exception occurs
    }

    static void printLength(String str) throws NullPointerException {
        if (str == null) {
            throw new NullPointerException("String cannot be null!");
        }
        System.out.println("Length: " + str.length());
    }
}
