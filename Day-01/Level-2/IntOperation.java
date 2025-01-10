//including scanner package to take input
import java.util.Scanner;
public class IntOperation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking a as input from user
		System.out.println("Enter value of a: ");
		int a = input.nextInt();
		
		//Taking b as input from user
		System.out.println("Enter value of b: ");
		int b = input.nextInt();
		
		//Taking c as input from user
		System.out.println("Enter value of c: ");
		int c = input.nextInt();
		
		//calculating result for first equation and storing it's result in a variable
		int result1 = a + b *c;
		
		//calculating result for second equation and storing it's result in a variable
		int result2 = a * b + c;
		
		//calculating result for third equation and storing it's result in a variable
		int result3 = c + a / b;
		
		//printing the result of expressions
		System.out.println("The results of Int Operations are " + result1 + "," + result2 + " and "+ result3);
		
		//closing scanner
		input.close();
		
	}
}
