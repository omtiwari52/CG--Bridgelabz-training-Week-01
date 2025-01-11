import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        // Creating instance of scanner class
        Scanner input = new Scanner(System.in);

        // Get input values for first number
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        
		//taking input values for second number
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();
        
		//taking input values for operator
        System.out.print("Enter the operator (+, -, *, /): ");
        String op = input.next();

        // Perform operations using switch statement
        switch (op) {
            case "+":
                // Performing addition
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                // Performing subtraction
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                // Performing multiplication
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Performing division and handle division by zero
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                // Handle invalid operator
                System.out.println("Invalid Operator.");
                break;
        }
        // Close the scanner
        input.close();
	}
}
