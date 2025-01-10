import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        // Declaring variable to store the year input
        int year;

        // Creating an instance of Scanner
        Scanner input = new Scanner(System.in);

        // taking year as input from user
        System.out.print("Enter the year (>= 1582): ");
        year = input.nextInt();
		
		
		//using if condition to check if the year is greater than 1582
        if (year >= 1582) {
		
			//checking if year is divisilbe by 4
            if (year % 4 == 0) {
			
				//checking if year is divisilbe by 100
                if (year % 100 == 0) {
				
					//checking if year is divisilbe by 400
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
						
					
                    }
					//writing else for not a leap year
					else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } 
				//writing else for a leap year
				else {
                    System.out.println(year + " is a Leap Year.");
                }
            } 
			//writing else for not a leap year
			else {
                System.out.println(year + " is not a Leap Year.");
            }
        } 
		else {
            System.out.println("The program works for years >= 1582 only.");
        }
        // Closing the scanner
        input.close();
	}
}