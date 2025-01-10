//importing the Scanner class for taking user inputs
import java.util.Scanner;
class SimpleInterest {
	public static void main(String[]args){
       
		Scanner input =new Scanner(System.in);
			
		//Create an variable named principal  and take input from user
		System.out.println("Enter principal amount: ");
		int principal  = input.nextInt();
			
		//Create an variable named rate and take input from user
		System.out.println("Enter rate of intrest: ");
		int rate  = input.nextInt();
			
		//Create an variable named time and take input from user
		System.out.println("Enter time period: ");
		int time  = input.nextInt();
			
		//Create an variable named simpleInterest to store the result
		int simpleInterest =   (principal*rate*time)/100;
			
		//Print the totalIncome
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);		 
			
	    //Closing the scanner object
	    input.close();
	}
}