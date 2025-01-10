//including scanner package to take input
import java.util.Scanner;
public class DistanceConversion{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking distance in feets as input from user
		System.out.println("Enter distance in feets: ");
		double distanceInFeets = input.nextDouble();
		
		//calculating distance in yards and storing result in double variable
		double distanceInYards = distanceInFeets / 3;
		
		//calculating distance in miles and storing result in double variable
		double distanceInMiles = distanceInYards / 1760;
		
		//printing the converted distance in yards and miles
		System.out.println("Distance in feets is "+ distanceInFeets + " while in yards is "+ distanceInYards + " and in miles is "
		+ distanceInMiles);
		
		//closing scanner
		input.close();
		
	}
}
