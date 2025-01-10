//including scanner package to take input
import java.util.Scanner;
public class TotalPriceOfItem{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking Quantity of Item as input from user
		System.out.println("Enter Quantity of item: ");
		double quantity = input.nextDouble();
		
		//Taking unit price of item as input from user
		System.out.println("Enter unit price of item: ");
		double unitPriceOfItem = input.nextDouble();
		
		//calculating total price and storing result in double variable
		double totalPrice = quantity * unitPriceOfItem;
		
		//printing the total price
		System.out.println("The total purchase price is INR "+ totalPrice + " if the quantity "+ quantity 
		+ " and unit price is INR "+ unitPriceOfItem);
		
		//closing scanner
		input.close();
		
	}
}
