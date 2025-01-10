//importing the Scanner class for taking user inputs
import java.util.Scanner;
class FactorialNumberForLoop{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named number and take input from user
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		int factorial = 0;
		
		if(number > 0){
			factorial = 1;
			for(int i = number ; i > 0; i--){
				factorial = factorial*i;
			}
		}
		//printing result 
		System.out.println("Factorial of number is " + factorial);
		
	    //Closing the scanner object
	    input.close();
	}
}