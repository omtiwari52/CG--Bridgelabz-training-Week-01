import java.util.Scanner;
public class CharacterFrequency {

	//method to find frequency of character
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }
	
	//method to print result array
    public static void displayFrequency(String[][] result) {
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s%-15s\n", "Character", "Frequency");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-15s%-15s\n", result[i][0], result[i][1]);
        }

        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
	
		//create an instance of scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[][] frequencyResult = findCharacterFrequency(text);
        displayFrequency(frequencyResult);

        input.close();
    }
}