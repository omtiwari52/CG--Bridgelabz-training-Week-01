import java.util.Scanner;
public class VowelConsonantCount2D{

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string using charAt()
    public static String[][] findVowelsAndConsonants(String str) {
        String[][] result = new String[str.length()][2];
	
		//iterating over the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
		
		//return the output
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("---------\t----");
		
		//iterating over the string array
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
	
		//create an instance of the scanner class
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String inputText = input.nextLine();

        // Find vowels and consonants
        String[][] results = findVowelsAndConsonants(inputText);

        // Display the results
        displayResults(results);
		
		//close scanner
        input.close();
    }
}
