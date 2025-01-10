import java.util.Scanner;
public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //taking input from user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Store the original number in another variable to check for divisiblity later
        int originalNumber = number;
        
        // create a variable sum and initialize it from 0
        int sum = 0;
        
        // Loop to calculate the sum of digits
        while (number > 0) {
            int digit = number % 10;     // Get the last digit
            sum += digit;                // Add the digit to sum
            number /= 10;                // Remove the last digit
        }
        
        // Checking if the original number is divisible by the sum
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } 
		else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
        input.close();
	}
}
