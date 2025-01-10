import java.util.Scanner;
public class MultipleOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking input from the user
        System.out.print("Enter The an number: ");
        int number = input.nextInt();

        // For loop start as backword 
        for (int i = 100; i >= 1; i--) {
            // Check if the number perfectly divisible by  i
            if (i % number == 0) {
                System.out.println(i);
            }
        }
		System.out.println("Multiples of " + number + " below 100 are:");
        input.close();
	}
}