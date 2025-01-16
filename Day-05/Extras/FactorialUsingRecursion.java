import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int number = input.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        input.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0) return 1;
        return n * calculateFactorial(n - 1);
    }
}
