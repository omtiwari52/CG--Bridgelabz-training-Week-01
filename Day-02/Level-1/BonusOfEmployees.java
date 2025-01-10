//importing the Scanner class for taking user inputs
import java.util.Scanner;
class BonusOfEmployees{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named salary and take input from user
		System.out.print("Enter salary: ");
		int salary = input.nextInt();
		
		//Create a int variable named years and take input from user
		System.out.print("Enter years of service: ");
		int years = input.nextInt();
		
		// creating a variable bonus and assigning it's value to 0
		int bonus = 0;
		
		
		//checking if the employee is working for more than 5 years or not
		if(years > 5){
			bonus = (salary * 5)/100;
		}
		System.out.println("Your bonus is " + bonus);
		
	    //Closing the scanner object
	    input.close();
	}
}