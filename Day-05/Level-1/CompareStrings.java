import java.util.Scanner;
public class CompareStrings{
	public static boolean isEqual(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int i = 0 ; i < str1.length(); i++){
			if(str1.charAt(i) == str2.charAt(i)){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args){
	
		//create an instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//get first string input from user
		System.out.println("Enter first string: ");
		String str1 = input.next().trim();
		
		//get second string input from user
		System.out.println("Enter second string: ");
		String str2 = input.next().trim();
		
		
		//initialize a boolean variable to store result from built-in method
		boolean builtInResult = str1.equals(str2);
		
		//initialize a boolean variable to store result from user dedfined method
		boolean methodResult = isEqual(str1, str2);
		
		if(builtInResult && methodResult){
			System.out.println("Both strings are equal");
		}
		else{
			System.out.println("Both strings are not equal");
		}
		
		// close scanner
		input.close();
	}
}