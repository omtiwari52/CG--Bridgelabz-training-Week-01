import java.util.Scanner;

public class RemoveSpecificCharacter {
    
    //method to remove a specific character from a string
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    //main method
    public static void main(String[] args) {

        //create instance of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();
        inputString = inputString.toLowerCase();

        //get input for character user wants to remove
        System.out.print("Enter the character to remove: ");
        char charToRemove = input.next().charAt(0);

        String modifiedString = removeCharacter(inputString, charToRemove);

        System.out.println("Modified String: " + modifiedString);

        //closing the input stream
        input.close();
    }

}
