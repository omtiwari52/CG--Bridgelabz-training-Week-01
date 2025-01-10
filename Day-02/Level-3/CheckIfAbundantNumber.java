import java.util.Scanner;
public class CheckIfAbundantNumber {
    public static void main(String[] args) {
        // Creating instance of scanner class
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // creating a variable sumOfDivisors and initializing it by 0
        int sumOfDivisors = 0;
		
		//iterating using loop
        for (int i = 1; i < number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        // Check if the number is abundant number or not
        if (sumOfDivisors > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        // Closing scanner
        input.close();
	}
}