//importing the Scanner class for taking user inputs
import java.util.Scanner;
class CheckEvenOddNumber{
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create a int variable named number and take input from user
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		
		//using for loop to iterate
		for(int i = 1 ; i < number; i++){
			
			//checking if the number is even
			if( i % 2 == 0){
				System.out.println(i + " is even number");
			}
			
			//if number is not even it must be odd
			else{
				System.out.println(i + " is odd number");
			}
		}
		
	    //Closing the scanner object
	    input.close();
	}
}