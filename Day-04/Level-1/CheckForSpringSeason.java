//importing the Scanner class for taking user inputs
import java.util.Scanner;
public class CheckForSpringSeason{

	//creating a method to check if it's a spring season or not 
	public static void springOrNot(int month, int day){
		
		//checking if the month is march and day is greater than or equal to 20 and month is june and day is less than or equal to 20
		if( (month == 3 && day >= 20) || (month == 6 && day <= 20) ){
		    System.out.println("Spring Season");
		}
		//checking if the month is april or may 
		else if(month > 3 && month < 6){
		    System.out.println("Spring Season");
		}
		//if month is not a spring season
		else{
		    System.out.println("Not Spring Season");
		}
	}
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named month and take input from user
		System.out.println("Enter month: ");
		int month = input.nextInt();		
		if(month > 6 || month < 3){
			System.out.println("Not Spring Season");
		}
		else{
			//Create a int variable named Day and take input from user
			System.out.println("Enter Day: ");
			int day = input.nextInt();
			springOrNot(month, day);
		}
	    //Closing the scanner object
	    input.close();
	}
}