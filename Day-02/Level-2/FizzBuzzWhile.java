import java.util.Scanner;
public class FizzBuzzWhile {
    public static void main(String[] args) {

        // Declaring Scanner class instance
        Scanner input = new Scanner(System.in);

        // taking input from user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking if the input is a positive integer
        if (number > 0) {
            // Initializing the loop variable
            int i = 0;
            // Using while loop to iterate from 0 to the input number
            while (i <= number) {
                // Checking for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i+ " FizzBuzz");
                }
                // Checking for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println(i+" Fizz");
                }
                // Checking for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println(i+" Buzz");
                }
               
                // Incrementing the loop variable
                i++;
            }
        }

        // Closing the scanner
        input.close();
	}
}
