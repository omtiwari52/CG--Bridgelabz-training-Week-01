import java.util.Scanner;
public class CovertToLowerCase{

	// Method to convert uppercase case alphabets Lowercase letters
	public static String ConvertToLowerCase(String text){
		// Value contains the result string after converted into the Lower case
		String resultString ="";
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			if(ch <= 97) resultString += (char) (ch + 32);
			else resultString += ch;
		}
		return resultString;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String text = input.next();
		
		String LowerCaseUsingMethod = text.toLowerCase(); // variable store upper using inbuilt mehtod
		String lowerCaseByMe = ConvertToLowerCase(text); // variable store upper case using our  class method
		
		// check if both are same result or not
		if(LowerCaseUsingMethod.equals(lowerCaseByMe)) System.out.println("Both the strings are equal "+lowerCaseByMe);
		else System.out.println("Not equal" + lowerCaseByMe);
		
		//input.close
		input.close();
	}
}