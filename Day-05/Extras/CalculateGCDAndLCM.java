import java.util.Scanner;

public class CalculateGCDAndLCM {

    //method to calculate GCD
    public static int calculateGCD(int a, int b) {
        if (b == 0) return a;
        return calculateGCD(b, a % b);
    }
    //method to calculate LCM
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
    //main method
    public static void main(String[] args) {

        //create instance of Scanner class
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter two numbers to calculate GCD and LCM:");
        int a = input.nextInt();
        int b = input.nextInt();

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        //closing the input stream
        input.close();
    }
}
