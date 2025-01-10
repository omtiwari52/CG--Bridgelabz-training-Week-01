import java.util.Scanner;

public class FactorsPrinting {
    public static void main(String[] args) {
        // Declaring a Scanner class
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop to find the factors and printing them
        for (int i = 1; i <= number; i++) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        // Closing scanner
        input.close();
	}
}