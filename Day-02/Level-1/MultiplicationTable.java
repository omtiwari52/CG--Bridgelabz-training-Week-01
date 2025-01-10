//importing scanner class
import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
	
		// Create a int variable name number and take input from user
		System.out.print("Enter number: ");
		int number = input.nextInt();
		
		// Using for loop to print the multiplication table
		for(int i = 6; i <= 9; i++){
			System.out.println(number + " * " + i +" = "+ (number * i));
		}

		//closing scanner
		input.close();
	}
	
}