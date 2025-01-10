import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // taking input from the user
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        
        // taking power as input from user
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        
        // Initialize the result variable to 1
        int result = 1;
        
        // Loop from 1 to power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Print the result
        System.out.println("Power "+ power + " of "+ number + " is " +result);
        
        input.close();
    }
}
