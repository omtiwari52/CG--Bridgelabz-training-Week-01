import java.util.Scanner;

public class MaximumOfThreeNumbers {

    //method to find maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    //main method
    public static void main(String[] args) {

        //create instance of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int max = findMax(a, b, c);
        System.out.println("The maximum number is: " + max);

        //closing the input stream
        input.close();
    }

}
