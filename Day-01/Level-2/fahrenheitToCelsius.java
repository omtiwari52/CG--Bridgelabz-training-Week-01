//including scanner package to take input
import java.util.Scanner;
public class fahrenheitToCelsius{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking temperature in fahrenheit as input from user
		System.out.println("Enter temperature in fahrenheit: ");
		int fahrenheit = input.nextInt();
		
		//calculating temperature in celsius
		int celsiusResult = (fahrenheit - 32) * 5/9;
		
		//printing the temperature in celsius
		System.out.println("The "+ fahrenheit +" fahrenheit in celsius is "+ celsiusResult +" celsius");
		
		input.close();
		
	}
}
