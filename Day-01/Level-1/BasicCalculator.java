//including scanner package to take input
import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
        //Taking first number as input and storing it in int variable
		double number1 = input.nextDouble();
		
		System.out.println("Enter Second Number: ");
		//Taking first number as input and storing it in int variable
        double number2 = input.nextDouble();
        
		//creating double variable to store result of addition
		double addition = number1 + number2;
		
		//creating double variable to store result of subtraction
		double subtraction = number1 - number2;
		
		//creating double variable to store result of multiplication
		double multiplication = number1 * number2;
		
		//creating double variable to store result of division
		double division = number1 / number2;
		
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 + " and "+ number2
		 + " is " + addition +","+ subtraction +","+ multiplication +","+ division);
		 input.close();
    }
}