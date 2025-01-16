import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        //creating the instance of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime:");
        int number =input.nextInt();
        boolean isPrime = isPrime(number);
        System.out.println(number + " is " + (isPrime ? "a prime number." : "not a prime number."));
        input.close();
    }
    //function to check number is prime or not
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
