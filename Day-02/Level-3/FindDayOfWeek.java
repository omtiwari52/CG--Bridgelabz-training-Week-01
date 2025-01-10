import java.util.Scanner;
public class FindDayOfWeek {
    public static void main(String[] args) {
		//Declare the scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int m = input.nextInt();
		System.out.print("Enter the day: ");
        int d = input.nextInt();
		System.out.print("Enter the year: ");
        int y = input.nextInt();
		
        // Calculate day using the provided formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Calculate d0 (day of the week)
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result
        System.out.println(d0);
	}
}