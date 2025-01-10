
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner class to get user input
        Scanner scanner = new Scanner(System.in);

        // Get an integer input and store variable
        System.out.print("Enter a number to check it is an Armstrong number or NOT: ");
        int number = scanner.nextInt();
		
        int sum = 0;
		
		//Create a copy of original number
        int originalNumber = number;

        // Use a while loop
        while (originalNumber != 0) {
            // Find the remainder (last digit) of the number
            int remainder = originalNumber % 10;

            // Add the cube of the remainder to 'sum'
            sum += remainder * remainder * remainder;

            // Remove the last digit of 'originalNumber'
            originalNumber /= 10;
        }

        // Check if sum and number are the same
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}

