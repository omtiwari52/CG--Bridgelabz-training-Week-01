import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // taking input from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Initialize the count variable to 0
        int digitCount = 0;
        
        // Use a loop to count the digits
        while(number != 0 ){
            number /= 10;    //removing last digit 
            digitCount++;         // after removing incrementing the count 
        }
        // Display the count
        System.out.println("The number of digits is: " + digitCount);
        
        input.close();
    }
}
