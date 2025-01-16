import java.util.Scanner;

public class ReplaceWord {

    // method to replace the word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Replace all occurrences of oldWord with newWord
        return sentence.replaceAll(oldWord, newWord +" ");
    }

    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = input.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = input.nextLine();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);

        //close scanner
        input.close();
    }

}
