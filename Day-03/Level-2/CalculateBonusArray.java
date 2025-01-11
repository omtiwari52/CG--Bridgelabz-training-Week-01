import java.util.Scanner;
public class CalculateBonusArray{
	public static void main(String[] args){
		
		//creating instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//taking salary input from user
		System.out.println("Please enter your salary: ");
		
		//define an array of type double to store the salary of employees
		double salary[] = new double[10];
		
		//define an array of type double to store the years of service of employees
		double years[] = new double[10];
		
		//define an array of type double to store the new salary of employees
		double newSalary[] = new double[10];
		
		//define an array of type double to store the bonus of employees
		double bonus[] = new double[10];
		
		//intializing variable to store total bonus , total old salary and total new salary
		double totalBonus = 0;
		double oldSalary = 0;
		double totalnewSalary = 0;
		
		for (int i = 0; i < 10; i++){
			System.out.print("Enter salary of employee "+(i+1)+":");
			salary[i] = input.nextDouble();
			
			//checking if the given input for salary is valid or invalid
			while(salary[i] <= 0){
				System.out.println("Please enter a valid salary");
				salary[i] = input.nextDouble();
			}
			System.out.print("Enter years of service of employee "+(i+1)+":");
			years[i] = input.nextDouble();
			
			//checking if the user input the valid or invalid years
			while(years[i] <= 0){
				System.out.println("Please enter a valid year");
				years[i] = input.nextDouble();
			}
		}
		
		// again running loop to calculate bonus of the employees
		for(int i = 0; i < 10; i++){
		
			//calculating for employees whose service is more than 5 years
			if(years[i] > 5){
				bonus[i] = salary[i] * 0.05;
			}
			
			// 2% if years less than 5 years
			else{
				bonus[i] = salary[i] * 0.02;
			}
			
			//calculating the new salary of employee
				newSalary[i] = salary[i] + bonus[i];
				
			//not calculate the totalOldSalary, totalBonus and total new salary
			totalBonus += bonus[i];
			oldSalary += salary[i];
			totalnewSalary += newSalary[i];
			
		}
		//taking years as input from user
		System.out.println("Total bonus given to employees: "+ totalBonus +"\nTotal old Salary: "+ oldSalary + "\n Total new Salary: "+totalnewSalary);
		
		//closing scanner
		input.close();
	}
}