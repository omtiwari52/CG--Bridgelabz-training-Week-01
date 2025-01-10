import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        // Declaring instance of Scanner class 
        Scanner input = new Scanner(System.in);

        // taking input from user to enter a positive integer
        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking if the input is a positive integer
        if (number > 0) {
            // Using for loop to iterate from 0 to the input number
            for (int i = 0; i <= number; i++) {
                // Checking for multiples of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i+" FizzBuzz");
                }
                // Checking for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println(i+" Fizz");
                }
                // Checking for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println(i+" Buzz");
                }
            }
        }
        // Closing scanner
        input.close();
	}
}