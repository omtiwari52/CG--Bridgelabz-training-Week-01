//importing the Scanner class for taking user inputs
import java.util.Scanner;
public class SumOfNumbers{

	//creating a method to find sum of n numbers
	public static int countSum(int number){
	
		//create a sum variable to store the sum of numbers
		int sum = 0;
		
		for(int i = 1; i <= number; i++){
			sum += i;
		}
		// return the sum of n numbers
		return sum;
	}
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named number and take input from user
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		while(number < 0){
			System.out.println("Invalid number enter Positive number: ");
			number = input.nextInt();
		}
		
		//initializing a variable ans to store sum
		int ans = countSum(number);
		
		System.out.println("The sum of the 'n' natural number is : "+ ans);
		
	    //Closing the scanner object
	    input.close();
	}
}