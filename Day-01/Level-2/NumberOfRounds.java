//including scanner package
import java.util.Scanner;
class NumberOfRounds {
    public static void main(String[] args) {

		//Creating an instance of Scanner class to take user input
		Scanner input = new Scanner(System.in);
		
        // Create variables to take user input for side1, side2 and side3
		System.out.println("Enter length of side 1 in meters: ");
        int side1 = input.nextInt();
		System.out.println("Enter length of side 2 in meters: ");
		int side2 = input.nextInt();
		System.out.println("Enter length of side 3 in meters: ");
		int side3 = input.nextInt();

        // Create a variable to store the given distance athlete wants to complete and convert it in meters
		int distance = 5;
		int distanceInMeter = 5000;

		// Formula to find the perimeter of a triangle
		int perimeter = side1 + side2 + side3;
		
		// Formula to find the number of rounds covered
		int rounds = distanceInMeter/perimeter;
		
		// Print the output for the number of rounds athlete will run to cover the distance
        System.out.print("The total number of rounds the athlete will run is " + rounds + " to complete " + distance + " km.");
		
		input.close();
	}
}