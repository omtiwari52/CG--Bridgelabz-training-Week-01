//including scanner package to take input
import java.util.Scanner;
public class LeapYearSingleLine{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking year as input from user
		System.out.println("Enter Year: ");
		int year = input.nextInt();
		//checking for leap year 
		if(year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))){
		    System.out.println("Leap Year");
		}
		else{
		    System.out.println("Not Leap Year");
		}
		//Closing scanner
		input.close();
		
	}
}
