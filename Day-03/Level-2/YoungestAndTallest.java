import java.util.Scanner;
public class YoungestAndTallest{
    public static void main(String[] args) {
	
		//creating instance of scanner class 
        Scanner input = new Scanner(System.in);

        // Define arrays for age and height of the 3 friends
        int[] age = new int[3];
        double[] height = new double[3];
		
		//using for loop to take input
        for (int i = 0; i < 3; i++) {
		
			// Take input for ages
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            age[i] = input.nextInt();
			
			// Take input for heights
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            height[i] = input.nextDouble();
        }

        // Find the youngest friend
        int youngestAge = age[0];
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        double tallestHeight = height[0];
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                tallestIndex = i;
            }
        }
        // printing the youngest and tallest friends
        System.out.println("Youngest Friend: " + (youngestIndex == 0 ? "Amar" : (youngestIndex == 1 ? "Akbar" : "Anthony")) + " with age " + youngestAge);
        System.out.println("Tallest Friend: " + (tallestIndex == 0 ? "Amar" : (tallestIndex == 1 ? "Akbar" : "Anthony")) + " with height " + tallestHeight);

        input.close();
    }
}
