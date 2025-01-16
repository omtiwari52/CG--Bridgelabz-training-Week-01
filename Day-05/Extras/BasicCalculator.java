import java.util.Scanner;

public class BasicCalculator {

    //method to add two number
    public static double add(double a, double b) {
        return a + b;
    }
    //method to subtract two number
    public static double subtract(double a, double b) {
        return a - b;
    }
    //method to multiply two number
    public static double multiply(double a, double b) {
        return a * b;
    }
    //method to divide two number
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
	    //create instance of scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Choose operation: (1) Add (2) Subtract (3) Multiply (4) Divide");
        int operation = input.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid operation.");
        }
        //close scanner
        input.close();
    }
}
