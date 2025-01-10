//importing the Scanner class for taking user inputs
import java.util.Scanner;
class IffirstIsSmallest{
	public static void main(String[]args){
	
		//Create an instance of Scanner class to take user inputs
		Scanner input =new Scanner(System.in);
			
		//Create an variable named number1 and take input from user
		System.out.println("Enter first number: ");
		int number1  = input.nextInt();
		
		//Create an variable named number2 and take input from user
		System.out.println("Enter second number: ");
		int number2  = input.nextInt();
		
		//Create an variable named number3 and take input from user
		System.out.println("Enter third number: ");
		int number3  = input.nextInt();
		
		if(number1 < number2 && number1 < number3){
		    System.out.println("Is the first number the smallest? Yes");
        }
		else{
		    System.out.println("Is the first number the smallest? No");
		}
	    //Closing the scanner object
	    input.close();
	}
}