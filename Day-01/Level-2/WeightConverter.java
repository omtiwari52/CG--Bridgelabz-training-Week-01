//importing the Scanner class for taking user inputs
import java.util.Scanner;
class WeightConverter {
	public static void main(String[]args){
            
		//Create an instance of Scanner class to take user inputs
		Scanner input = new Scanner(System.in);
			
		//Create an variable named pound and take input from user
		System.out.println("Enter weight in pounds");
		double weightInPound  = input.nextDouble();	
		
		//Create an variable named kilograms to store the result
		double kilograms =  weightInPound * 0.453592;
		
		//Print the weight in kilograms
		System.out.println("The weight of the person in pound is " + weightInPound + " and in kg is " + kilograms);
		
	    //Closing the scanner object
	    input.close();
	}
}