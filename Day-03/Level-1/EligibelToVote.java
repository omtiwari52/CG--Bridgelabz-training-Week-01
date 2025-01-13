import java.util.Scanner;
public class EligibelToVote {
    public static void main(String[] args) {
	
        // Define an array of size 10 for storing the ages of 10 students
        int[] ages = new int[10];
		
		//creating instance of scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for the ages of 10 students
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age of Student " + (i + 1) + " :");
            ages[i] = input.nextInt();
        }

        // Checking for each student if eligible to vote or not
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age for Student " + (i + 1) + ": " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        input.close();
    }
}