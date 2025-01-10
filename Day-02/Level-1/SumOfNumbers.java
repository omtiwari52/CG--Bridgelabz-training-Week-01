//importing the Scanner class
import java.util.Scanner;
class SumOfNumbers{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a Double variable named UserValue and take input from user
		System.out.println("Enter Value: ");
		double userValue = input.nextDouble();	
		
		
		// creating a variable of type double to store the sum
		double total = 0.0;
		
		//using while loop to check if the user entered value is 0 or not
		while(userValue != 0){
		    total += userValue;
			System.out.println("Enter Value again: ");
			userValue = input.nextDouble();
		}
		//Displaying total value
		System.out.println("Your total Sum is "+ total);
	    //Closing the scanner object
	    input.close();
	}
}