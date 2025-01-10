//importing the Scanner class for taking user inputs
import java.util.Scanner;
class CheckNumberDivisibleToFive{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named number and take input from user
		System.out.println("Enter number: ");
		int number = input.nextInt();	
		
		if( number % 5 == 0){
		    System.out.println("Is the number "+ number + " divisible by 5? Yes");
		}
		else{
		    System.out.println("Is the number "+ number + " divisible by 5? No");
		}
		
	    //Closing the scanner object
	    input.close();
	}
}