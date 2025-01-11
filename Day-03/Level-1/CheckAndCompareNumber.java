import java.util.Scanner;

public class CheckAndCompareNumber {
    public static void main(String[] args) {
        // Define an integer array of 5 elements
        int[] numbers = new int[5];
		
		//creating instance of scanner class
        Scanner input = new Scanner(System.in);

        //taking input from the user for array elements
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // iterate the array to analyze the numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("The given number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("The given number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative.");
            } else {
                System.out.println("The number " + numbers[i] + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        input.close();
    }
}
