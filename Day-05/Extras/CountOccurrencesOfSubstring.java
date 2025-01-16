import java.util.Scanner;

public class CountOccurrencesOfSubstring {
    // Method which counts occurrences of the substring
    public static int countSubstring(String text, String subStringValue) {
        int count = 0;
        int index = 0;

        // Loop to search for substring in text
        while ((index = text.indexOf(subStringValue, index)) != -1) {
            count++;
            index += subStringValue.length();
        }
        return count;
    }
    public static void main(String[] args) {
        // Declaring scanner object
        Scanner input = new Scanner(System.in);

        // Get user input string
        System.out.println("Enter the string: ");
        String text = input.next();
		
        System.out.println("Enter the substring: ");
        String subString = input.next();

        // Count occurrences of substring
        int ans = countSubstring(text, subString);

        // Print the result
        System.out.println("The substring appears " + ans + " times in the given string.");

		//close scanner
		input.close();
	}
}