import java.util.Scanner;
public class InputSum{
    public static void main(String[] args) {	
		//creating instance of scanner class
        Scanner input = new Scanner(System.in);
		
		// Array to store up to 10 numbers
        double[] numbers = new double[10]; 
		
		// Initializing variables
        double total = 0.0;             // To store the sum of all numbers
        int index = 0;                  // Index variable for the array

        System.out.println("Enter 10 numbers (Enter 0 or a negative number to stop):");

        // Infinite loop for user input
        while (true) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();

            // Break if 0 or negative number is entered
            if (num <= 0) {
                break;
            }

            // Break if the array is full
            if (index == 10) {
                System.out.println("Maximum of 10 numbers reached");
                break;
            }
            // Store the number in the array and increment index
            numbers[index] = num;
            index++;
        }    
        // Display all entered numbers and the total
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i]+" ");
			//claculating total sum
			total += numbers[i];
        }
		//printing total sum
        System.out.println("\nSum of all numbers: " + total);

        input.close();
    }
}
