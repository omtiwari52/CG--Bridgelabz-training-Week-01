import java.util.Scanner;
public class MultiplicationTableOfNumber {
    public static void main(String[] args) {
	
		// creating an instance of scanner class
        Scanner input = new Scanner(System.in);

        // taking an integer as input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an integer array to store the results of multiplication
        int[] multiTable = new int[10];

        //using loop to calculate multiplication 
        for (int i = 0; i < multiTable.length; i++) {
            multiTable[i] = number * (i + 1);      
        }
        // Display the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < multiTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiTable[i]);
        }
        input.close();
    }
}