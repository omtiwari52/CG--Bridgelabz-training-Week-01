import java.util.Scanner;
public class CompareArrays{
	
	//method to return substring of a string
	public static char[] returnCharacter (String str, char[] str1){
	
		//use for loop to iterate over the string
		for(int i = 0;  i < str.length(); i++){
			str1[i] += str.charAt(i);
		}
		return str1;
	}
	
	//method to compare arrays
	public static boolean compareArray(char arrayFromBuiltIn[], char arrayFromMethod[], int length){
		for(int i = 0; i < length; i++){
			if(arrayFromBuiltIn[i] != arrayFromMethod[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void printArray(char arrayFromBuiltIn[], int length){
		for(int i = 0; i <length; i++){
			System.out.print("Character of string are "+ arrayFromBuiltIn[i] +", ");
		}
	}
	public static void main(String[] args){
	
		//create an instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//get first string input from user
		System.out.println("Enter first string: ");
		String str = input.next().trim();
		
		//initialize a array to store the resultant subString from method
		char arrayFromMethod[] = new char[str.length()];
		
		//call returnCharacter method to store the resultant character in array
		returnCharacter(str, arrayFromMethod);
		
		
		//initialize another array to store the result from built-in method
		char arrayFromBuiltIn[] = str.toCharArray();
		
		int length = str.length();
		
		boolean comapreResult = compareArray(arrayFromBuiltIn, arrayFromMethod,length);
		
		if(comapreResult){
			System.out.println("Both arrays are equal");
		}
		else{
			System.out.println("Both arrays are not equal");
		}
		//close scanner
		input.close();
	}
}