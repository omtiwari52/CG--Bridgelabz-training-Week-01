//importing the Scanner class for taking user inputs
import java.util.Scanner;
class LargestAndSmallestNumber{

	//creating a method to find out which of 3 number is largest
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
	
		//initialize an array of size 2 to store the smallest and largest number
		int ans[]=new int[2];
		ans[0]=Math.max(number1,Math.max(number2,number3));
		ans[1]=Math.min(number1,Math.min(number2,number3));
		return ans;
	}
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
		
		int ans[]= findSmallestAndLargest(number1,number2,number3);
		System.out.print("The maximun number is "+ ans[0] +" and  miniumum is "+ans[1] + " among three numbers ");
		
	    //Closing the scanner object
	    input.close();
	}
}