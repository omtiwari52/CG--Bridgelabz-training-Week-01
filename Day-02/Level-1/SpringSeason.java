//importing the Scanner class for taking user inputs
import java.util.Scanner;
class SpringSeason{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named month and take input from user
		System.out.println("Enter month: ");
		int month = input.nextInt();	
		
		
		//Create a int variable named Day and take input from user
		System.out.println("Enter Day: ");
		int day = input.nextInt();
		
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
		
	    //Closing the scanner object
	    input.close();
	}
}