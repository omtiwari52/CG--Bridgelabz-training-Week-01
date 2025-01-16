import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    
    //method to generate random number
    private static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
     //main method
    public static void main(String[] args) {
        //creating the instance of Scanner class
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        String feedback;
        System.out.println("Think of a number between 1 and 100.");
        do {
            guess = generateGuess(lowerBound, upperBound);
            System.out.println("Is your number " + guess + "? (Enter: 'high', 'low', 'correct')");
            feedback = input.nextLine();

            if ("high".equalsIgnoreCase(feedback)) {
                upperBound = guess - 1;
            } else if ("low".equalsIgnoreCase(feedback)) {
                lowerBound = guess + 1;
            }

        } while (!"correct".equalsIgnoreCase(feedback));
        System.out.println("The computer guessed your number!");


        //closing the input stream
        input.close();
    }
}
