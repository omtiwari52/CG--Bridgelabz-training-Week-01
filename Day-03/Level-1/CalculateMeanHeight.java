import java.util.Scanner;
public class CalculateMeanHeight {
    public static void main(String[] args) {
		//creating instance of scanner class
        Scanner input = new Scanner(System.in);

        // Define an array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Taking input from user for the heights of the players
        System.out.println("Enter the heights of players (in cm):");
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter Player " + (i + 1) + " height : ");
            heights[i] = input.nextDouble();
            sum += heights[i];    // Adding height of each player to the sum
        }
        // Calculate the mean height
        double mean = sum / 11;

        // Print the mean height
        System.out.print("The mean height of the football team is: "+ mean +" cm");

		//closing scanner
        input.close();
    }
}