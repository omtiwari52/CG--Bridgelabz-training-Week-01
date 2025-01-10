import java.util.Scanner;
public class GreatestFactor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // taking input from user
        System.out.print("Enter number: ");
        int number = input.nextInt();
        
        // Initialize the greatestFactor variable to 1
        int greatestFactor = 1;
        
		// Iterating backwards
        for (int i = number - 1; i >= 1; i--) {
            // Check if number is perfectly divisible by i
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        
        input.close();
    }
}
