//importing the Scanner class for taking user inputs
import java.util.Scanner;
class CompareSumNaturalNumber{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named number and take input from user
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		int formulaeResult = 0;
        if (number > 0){
		    formulaeResult = number * (number + 1)/2;
		}		
		
		int loopResult = 0;
		//using while loop to decrement the number
		while(number > 0){
		    loopResult += number;
			number--;
		}
		//printing result 
		System.out.println("Result obtained using formulae is "+ formulaeResult + " and using while loop is "+ loopResult);
		
	    //Closing the scanner object
	    input.close();
	}
}