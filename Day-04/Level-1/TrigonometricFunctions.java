import java.util.Scanner;
import java.util.*;
public class TrigonometricFunctions{
	public static void main(String args[]){
	
		//create and instance of scanner class
		Scanner input= new Scanner(System.in);
		
		//take input from user
		System.out.println("Enter angle (in degrees)");
		double angle=input.nextDouble();
		
		//create new method to perform trigonometric calculatiom
		double[] results =calculateTrigonometricFunctions(angle);
				
		// Print the results
		System.out.println("For angle: " + angle + " degrees");
		System.out.println("Sine: " + results[0]);
		System.out.println("Cosine: " + results[1]);
		System.out.println("Tangent: " + results[2]);
	}

	public static double[] calculateTrigonometricFunctions(double angle){
	
		// Convert input angle from degrees to radians
		double radians = Math.toRadians(angle);
		
		// Calculate sine, cosine, and tangent
		double sine = Math.sin(radians);
		double cosine = Math.cos(radians);
		double tangent = Math.tan(radians);
		
		
		// Return results as an array
		return new double[]{sine, cosine, tangent};
	}
}