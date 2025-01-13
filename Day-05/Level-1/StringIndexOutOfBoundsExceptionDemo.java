import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Attempting to access an invalid index
        int length = text.length();
        text.charAt(length); // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // This may throw a StringIndexOutOfBoundsException
            int length = text.length();
            text.charAt(length);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Declaring the scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String userString = input.nextLine(); // Initialize the variable

        try {
            generateException(userString); // Call method that generates StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught in main: StringIndexOutOfBoundsException occurred!");
        }

        handleException(userString); // Call method that handles StringIndexOutOfBoundsException

        input.close(); // Close the scanner
	}
}