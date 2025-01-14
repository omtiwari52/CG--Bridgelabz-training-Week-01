import java.util.Scanner;
public class CountVowelsAndConsonant{

	//Method which count vowels and consonants
	public static void Count(String text){
	
		//converting string to lowercase to avoid case conflict
		text.toLowerCase();
		
		//initialize a variable count to count the number of vowels
		int count = 0;
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				count++;
			}
		}
		
		//print output 
		System.out.print("There are " + count + " vowels and " + (text.length() - count )+" consonants");
	} 
	
	public static void main(String[] args){
	
		// Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// Get user input string
		System.out.println("Enter the string : ");
		String text = input.nextLine();
		Count(text);
		
		//close scanner
		input.close();
	}
}