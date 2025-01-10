//including scanner package to take input
import java.util.Scanner;
public class TotalIncome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking salary as input from user
		System.out.println("Enter Salary: ");
		int salary  = input.nextInt();
		
		//Taking bonus as input from user
		System.out.println("Enter Salary: ");
		int bonus  = input.nextInt();
		
		//creating a variable to store the result of total income
		int totalIncome = salary + bonus;
		
		//printing total salary
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+ ".Hence Total Income is INR "+totalIncome);
		
		//closing scanner
		input.close();
		
	}
}
