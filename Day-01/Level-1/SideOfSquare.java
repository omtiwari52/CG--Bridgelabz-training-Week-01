//including scanner package to take input
import java.util.Scanner;
public class SideOfSquare{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking perimeter of square as input from user
		System.out.println("Enter perimeter of square : ");
		double perimeterOfSquare = input.nextDouble();
		
		//calculating side of square
		double sideOfSquare = perimeterOfSquare/4;
		
		//printing the side of square
		System.out.println("The length of the side of square is "+ sideOfSquare + " whose perimeter is " + perimeterOfSquare);
		
		input.close();
		
	}
}
