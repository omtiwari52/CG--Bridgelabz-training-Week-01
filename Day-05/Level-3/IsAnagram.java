import java.util.Scanner;
import java.lang.String;
public class IsAnagram{
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String string1, String string2) {
        // Check if lengths of both texts are equal
        if (string1.length() != string2.length()) {
            return false;
        }
        // Create frequency arrays to store the character counts of both texts
        int[] frequency1 = new int[256]; // ASCII size of 256
        int[] frequency2 = new int[256];

        // Loop through both texts and calculate frequency of each character
        for (int i = 0; i < string1.length(); i++) {
            frequency1[string1.charAt(i)]++;
            frequency2[string2.charAt(i)]++;
        }

        // Compare the frequency arrays of both texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // If frequencies don't match, not an anagram
            }
        }

        return true; // If all frequencies match, the texts are anagrams
    }

    // Main method
    public static void main(String[] args) {
        //creating the instance of Scanner class
        Scanner input = new Scanner(System.in);

        // Take user input for two texts
        System.out.print("Enter the first text: ");
        String string1 = input.nextLine();
        System.out.print("Enter the second text: ");
        String string2 = input.nextLine();
        // Call the method to check if the string are anagrams
        boolean result = areAnagrams(string1,string2);
        // show the result
        if (result) {
            System.out.println("The given strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        //close scanner
        input.close();
    }
}

