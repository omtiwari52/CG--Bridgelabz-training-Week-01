import java.util.*;
public class SumOfNaturalNumber{
	
	//method to calculate sum using recursion
    public static int sumUsingRecursion(int number) {
        if (number == 1) {
            return 1;
        }
        return number + sumUsingRecursion(number - 1);
    }

    // Method to calculate sum using the Formulae n*(n+1)/2
    public static int sumUsingFormulae(int number) {
        return number * (number + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Input is not a natural number. Exiting.");
            return;
        }

        int recursiveSum = sumUsingRecursion(number);

        // Calculate the sum using the Formulae
        int FormulaeSum = sumUsingFormulae(number);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using Formulae: " + FormulaeSum);

        if (recursiveSum == FormulaeSum) {
            System.out.println("Both computations are correct");
        }
		//close scanner
		input.close();
    }
}
