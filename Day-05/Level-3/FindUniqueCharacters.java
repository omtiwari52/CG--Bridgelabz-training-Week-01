import java.util.Scanner;
public class FindUniqueCharacters {
	
	//method to find the length of string and also handle the exception
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }

	//method to find and store unique characters
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;
	
		//iterate over the text using for loop
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

			//nested loop
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
			
			//check if isUnique is true or false
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
		
		//store the result in a character array and return the array as output;
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }
	
	//method to print array
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
	
		//create an instance of scanner class
        Scanner input = new Scanner(System.in);
		 
		//get input from user
        System.out.println("Enter a string:");
        String text = input.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);
        displayUniqueCharacters(uniqueChars);
		
		//close scanner
        input.close();
    }
}
