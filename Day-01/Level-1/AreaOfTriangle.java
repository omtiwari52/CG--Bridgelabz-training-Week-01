//including scanner package to take input
import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking base of triangle as input from user
		System.out.println("Enter base of triangle in Cm: ");
		double base = input.nextDouble();
		
		//Taking height of triangle as input from user
		System.out.println("Enter height of triangle in Cm: ");
		double height = input.nextDouble();
		
		//calculating area of triangle in centimeter square
		double areaInSquareCentimeters = (1 * base * height)/2;
		
		//calculating area of triangle in square inches
		double areaInSquareInches = areaInSquareCentimeters * 0.155;
		
		//printing the area of triangle
		System.out.println("Area of triangle in square centimeters is "+ areaInSquareCentimeters +" while in square inches is "+
		areaInSquareInches);
		
		input.close();
		
	}
}
