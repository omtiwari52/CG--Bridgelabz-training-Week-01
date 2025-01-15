import java.util.Scanner;
public class FindFirstNonRepeatingCharacter {
	
	//method to find First Non Repeating Character
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] freq = new int[256];  
		
		//iterating over the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
		 //iterating over the string
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return ' ';  
    }

    public static void main(String[] args) {
	
		//create an instance of scanner class
        Scanner input = new Scanner(System.in);

		//get input from user
        System.out.println("Enter a string:");
        String text = input.nextLine();
		
		//invoking method and storing result in a char variable
        char result = findFirstNonRepeatingCharacter(text);
		
		//using conditional statement
        if (result == ' ') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }
		
		//close scanner
        input.close();
    }
}
