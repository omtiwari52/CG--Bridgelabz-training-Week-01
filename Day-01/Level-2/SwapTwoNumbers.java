//including scanner package to take input
import java.util.Scanner;
public class SwapTwoNumbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking number1 as input from user
		System.out.println("Enter number1: ");
		int number1  = input.nextInt();
		
		//Taking number2 as input from user
		System.out.println("Enter number2: ");
		int number2  = input.nextInt();
		
		//printing numbers before swapping
		System.out.println("The value of number1 is "+number1+ " and number2 is " +number2);
		
		//swapping number1 and number2 by using third variable number3
		int number3 = number1;
		number1 = number2;
		number2 = number3;
		
		
		//printing swapped numbers
		System.out.println("The value of number1 after swapping is "+number1+ " and number2 is " +number2);
		
		//closing scanner
		input.close();
		
	}
}
