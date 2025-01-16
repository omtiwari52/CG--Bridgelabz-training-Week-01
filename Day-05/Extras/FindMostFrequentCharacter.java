import java.util.Scanner;

public class FindMostFrequentCharacter {

    //method to find most frequent character ina sentence
    public static char findMostFrequentCharacter(String str) {
        int[] charCounts = new int[256]; // ASCII character count array
    
        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }
    
        char mostFrequentChar = '\0';
        int maxCount = 0;
    
        // Find the character with the maximum frequency
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > maxCount) {
                maxCount = charCounts[i];
                mostFrequentChar = (char) i;
            }
        }
        return mostFrequentChar;
    }

    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String inputText = input.nextLine();
        char mostFrequentChar = findMostFrequentCharacter(inputText);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
        //closing the input stream
        input.close();
    }
}
