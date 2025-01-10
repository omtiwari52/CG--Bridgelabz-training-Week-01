import java.util.Scanner;
public class RocketLaunchCounterForLoop{
	public static void main(String[] args){
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter counter: ");
		
		// Get input value of counter
		int counter = input.nextInt();
		
		// Loop for countDown until counter is equal to 1
		for(int i = counter; i > 0; i--){
			// Printing the counter value until 1
			System.out.println(i);
		}
		
		//close the scanner input
		input.close();
	}
	
}