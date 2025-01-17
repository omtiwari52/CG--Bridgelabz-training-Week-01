import java.util.Scanner;
public class CheckPalindromeString{

	//Method which checks if string is pallindrome or not
	public static boolean isPallindrome(String text){
		int i = 0, j = text.length() - 1;
		while(i < j){
			if(text.charAt(i++) != text.charAt(j--)) return false;
		}
		return true;
	} 
	public static void main(String[] args){
	
		// Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// Get user input string
		System.out.println("Enter the string : ");
		String text = input.nextLine();
		
		//Display the result 
		System.out.println(isPallindrome(text));
		
		//Close the scanner object
		input.close();
	}
}