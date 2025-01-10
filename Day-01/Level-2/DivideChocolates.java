import java.util.Scanner;
class DivideChocolates {
    public static void main(String[] args) {

		//Creating an instance of Scanner class to take user input
		Scanner input = new Scanner(System.in);
		
        //Create variable to take user input for numberOfchocolates
        System.out.println("Enter number of chocolates: ");		
        int numberOfchocolates = input.nextInt();

        //Create a variable to take user input for numberOfChildren
		System.out.println("Enter number of children: ");
		int numberOfChildren = input.nextInt();
		
		//Number of chocolates each child will get
		int distributedChocolates = numberOfchocolates / numberOfChildren;

		// Number of remaining chocolates
		int remainingChocolates = numberOfchocolates % numberOfChildren;
		
		// Print the output for the number of chocolates each child gets and the number remainingChocolates
        System.out.print("The number of chocolates each child gets is " + distributedChocolates + " and the number of remaining chocolates are " + remainingChocolates);
		input.close();
	}
}