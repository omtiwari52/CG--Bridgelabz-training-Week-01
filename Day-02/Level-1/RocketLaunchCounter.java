//importing the Scanner class for taking user inputs
import java.util.Scanner;
class RocketLaunchCounter{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named counter and take input from user
		System.out.println("Enter Counter: ");
		int counter = input.nextInt();	
		
		//using while loop to decrement the counter
		while(counter >= 1){
		    
			System.out.println(counter);
			counter--;
		}
	    //Closing the scanner object
	    input.close();
	}
}