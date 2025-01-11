import java.util.Scanner;
public class FrequencyOfDigit {
    public static void main(String[] args) {
	
        // Create a Scanner object for taking user input
        Scanner input = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        
        // Convert the number to a string to easily extract digits
        String numString = Long.toString(number);
        
        // Create an array to store the frequency of digits (size 10 for digits 0-9)
        int[] frequency = new int[10];
        
        // Loop through the string to extract each digit and update frequency
        for (int i = 0; i < numString.length(); i++) {
            // Get the current digit as a character, then convert it to an integer
            char digitChar = numString.charAt(i);
            int digit = digitChar - '0';  // Convert char to its numeric value
            
            // Increase the frequency of the digit
            frequency[digit]++;
        }
        
        // Display the frequency of each digit (0 to 9)
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }
        // Close the scanner object
        input.close();
	}
}