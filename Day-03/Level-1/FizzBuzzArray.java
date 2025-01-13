import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args) {

	//creating instance of scanner class
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // checking if the given input is positive integeror not
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            return;
        }

        // Create a String array to store results
        String[] results = new String[number];

        // Loop from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            } 
			else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            } 
			else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
            } 
			else {
                results[i - 1] = String.valueOf(i);
            }
        }

        // Printing the resultant array
        System.out.println("Results:");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        input.close();
    }
}
