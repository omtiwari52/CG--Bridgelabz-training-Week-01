//importing the Scanner class for taking user inputs
import java.util.Scanner;
class CheckIfVote{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named age and take input from user
		System.out.println("Enter Age: ");
		int age = input.nextInt();	
		
		
		//checking if the age is valid or not using conditional statements
		if(age < 0){
		    System.out.println("Invalid age");
		}
		
		
		//checking if the user is eligible to vote or not
		else if( age >= 18){
		    System.out.println("The person's age is "+age+" and can vote.");
		}
		
		//writing else statement if the user is not eligible to vote
		else{
		    System.out.println("The person's age is "+age+" and cannot vote.");
		}
		
	    //Closing the scanner object
	    input.close();
	}
}