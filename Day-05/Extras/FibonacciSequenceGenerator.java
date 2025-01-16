import java.util.Scanner;

public class FibonacciSequenceGenerator {

    //method to calculate fibonacci
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1, next;
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {

        //create instance of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci sequence:");
        int terms = input.nextInt();
        generateFibonacci(terms);

        //closing the input stream
        input.close();
    }
    
}
