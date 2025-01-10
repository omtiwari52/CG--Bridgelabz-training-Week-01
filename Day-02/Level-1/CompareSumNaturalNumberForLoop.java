//importing the Scanner class for taking user inputs
import java.util.Scanner;
class CompareSumNaturalNumberForLoop{
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
		//using for loop to decrement the number and find result
		for(int i = number; i > 0 ; i--){
		    loopResult += i;
		}
		//printing result 
		System.out.println("Result obtained using formulae is "+ formulaeResult + " and using for loop is "+ loopResult);
		
	    //Closing the scanner object
	    input.close();
	}
}