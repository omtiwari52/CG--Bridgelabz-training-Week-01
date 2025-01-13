import java.util.Scanner;
public class CalculateSimpleInterest{

	//  Initialize the new method to calculate simple interest
	public static double SimpleInterest(double principal, double rate, double time){
	
	    // calculate the result and store it into a double variable
		double result = ( principal * rate * time) / 100;
		
		// Return the result
		return result;
	}
	public static void main(String [] args){
	
		//create instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//create a variable and take principal amount as input from user
		System.out.print("Please enter the Principal Amount:  ");
		double principal = input.nextDouble();
		
		//create a variable and take rate of interest as input from user
		System.out.print("Please enter the Rate of Interest (in %):  ");
		double rate = input.nextDouble();
		
		//create a variable and take time duration as input from user
		System.out.print("Please enter the Time Duration (in year):  ");
		double time = input.nextDouble();
		
		
		// Initialize variable to store the result
		double simpleInterest = SimpleInterest(principal, rate, time);
		
		
		// Display the result
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + "%  and Time " + time);
		
		//close scanner
		input.close();
	}
}