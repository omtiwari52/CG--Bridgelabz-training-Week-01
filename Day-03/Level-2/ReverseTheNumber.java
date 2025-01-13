import java.util.Scanner;
public class ReverseTheNumber {
    public static void main(String[] args) {
		
		//creating instance of scanner class
        Scanner input = new Scanner(System.in);

        // taking input form user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Count the number of digits in the number
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        // Create an array to store digits
        int[] digits = new int[count];
        tempNumber = number;
        int index = 0;

        // Store digits in the array
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber = tempNumber / 10;
            index++;
        }
		
        // printing the reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
		
		//closing scanner
        input.close();
    }
}
