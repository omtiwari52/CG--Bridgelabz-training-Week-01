//including scanner package to take input
import java.util.Scanner;
public class CelsiusTofahrenheit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking temperature in celsius as input from user
		System.out.println("Enter temperature in celsius: ");
		int celsius  = input.nextInt();
		
		//calculating temperature in fahrenheit
		int fahrenheitResult  = (celsius  * 9/5) + 32;
		
		//printing the temperature in fahrenheit
		System.out.println("The "+ celsius  +" celsius in fahrenheit is "+ fahrenheitResult +" fahrenheit");
		
		input.close();
		
	}
}
