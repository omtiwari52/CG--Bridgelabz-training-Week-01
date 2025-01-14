import java.util.Scanner;
import java.util.Arrays;
public class LongestWordSequence{

	//Method which find the longest word sequence
	public static String longestSequence(String text){
		// String array which contains the words
		String[] splittedString = text.split(" ");
		
		String str = "";
		
		// Iterate over the string array
		for(int i = 0; i < splittedString.length; i++){
			String word = splittedString[i];
			
			// checks the length o the string from array and str length
			if(word.length() > str.length()){
				str = "";
				str = word;
			}
		}
		return str;
	} 
	
	
	public static void main(String[] args){
	
		// Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// Get user input string
		System.out.println("Enter the string : ");
		String text = input.nextLine().trim();
		
		//Store the longestword sequence resultantString variable
		String resultantString = longestSequence(text);
		
		System.out.println(resultantString);
		
		input.close();
		
	}
}