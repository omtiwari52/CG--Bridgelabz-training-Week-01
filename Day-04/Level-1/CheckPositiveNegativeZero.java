import java.util.Scanner;
class CheckPositiveNegativeZero{

	// Initialize the CheckIntegers method whose return type is int
	public static int CheckIntegers(int number){
	
		//checking if number is negative
		if (number < 0){
			return -1;
		}
		
		//checking if number is positive
		else if(number > 0){
			return 1;
		}
		
		//checking if number is zero
		else{
			return 0;
		}
	}
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		// Take the Integer number by user
		System.out.print("Enter the Integer Number:  ");
		int number = input.nextInt();
		
		//call method and pass number as input parameter and store the reuslt in a variable
		int result=CheckIntegers( number); // store the result
		
		// Display the result
		System.out.println(result);
				
		//close the scanner
		input.close();
	}
}