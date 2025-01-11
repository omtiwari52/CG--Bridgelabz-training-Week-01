import java.util.Scanner;
public class PrintFactorsOfNumber{
    public static void main(String[] args) {
	
		//creating instance of scanner class
        Scanner input = new Scanner(System.in);

        // Taking input from user for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking if the number is positive or not
        if (number <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }
        // creating a variable named maxFactor
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number by using for loop
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the array is full, resizing the maxFactor to it's double
                if (index == maxFactor) {
                    maxFactor *= 2;
					
					//creating a temporary array with new double size
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy elements
                    factors = temp; // Reassign the array
                }
                // Add the factor to the array
                factors[index++] = i;
            }
        }
        // Printing the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

		//closing scanner
        input.close();
    }
}
