import java.util.Scanner;
public class QuotientReminder{

	// create a method to find out quotient and reminder of two number
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		
		//initialize an array of size 2 to store quotient and reminder of two number
		int ans[] = new int[2];
		
		//calculating quotient of numbers
		ans[0] = number/divisor;
		
		//Calculating reminder of numbers
		ans[1] = number%divisor;
		
		return ans;
	}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking 1st number as input
		System.out.println("Enter 1st number: ");
		int number = input.nextInt();
		
		//Taking 2nd number as input
		System.out.println("Enter 2nd number: ");
		int divisor = input.nextInt();
		
		int ans[] = findRemainderAndQuotient(number,divisor);
		
		//printing the quotient and remainder of number
		System.out.println("The Quotient is "+ ans[0] + " and Reminder is "+ ans[1] +" of two number "
        + number +" and "+ divisor);
		
		//close the scanner
		input.close();
		
	}
}