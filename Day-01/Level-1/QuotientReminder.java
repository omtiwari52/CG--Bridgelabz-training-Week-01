import java.util.Scanner;
public class QuotientReminder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking 1st number as input
		System.out.println("Enter 1st number: ");
		int number1 = input.nextInt();
		
		//Taking 2nd number as input
		System.out.println("Enter 2nd number: ");
		int number2 = input.nextInt();
		
		//calculating quotient of numbers
		int quotient = number1/number2;
		
		//Calculating reminder of numbers
		int reminder = number1%number2;
		
		//printing the quotient and remainder of number
		System.out.println("The Quotient is "+ quotient + " and Reminder is "+ reminder +" of two number "
        + number1 +" and "+ number2);
		
		//closing scanner
		input.close();
		
	}
}