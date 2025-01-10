//including scanner package to take input
import java.util.Scanner;
public class DoubleOperation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking a as input from user
		System.out.println("Enter value of a: ");
		double a = input.nextDouble();
		
		//Taking b as input from user
		System.out.println("Enter value of b: ");
		double b = input.nextDouble();
		
		//Taking c as input from user
		System.out.println("Enter value of c: ");
		double c = input.nextDouble();
		
		//calculating result for first equation and storing it's result in a variable
		double result1 = a + b *c;
		
		//calculating result for second equation and storing it's result in a variable
		double result2 = a * b + c;
		
		//calculating result for third equation and storing it's result in a variable
		double result3 = c + a / b;
		
		//printing the result of expressions
		System.out.println("The results of Int Operations are " + result1 + "," + result2 + " and "+ result3);
		
		//closing scanner
		input.close();
		
	}
}
