import java.util.Scanner;
public class ReverseString{
	
	//create a method to reverse a string
	public static void reverseString(String str){
		
		//create a variable to store the revrsed string
		String str1 = "";
		for(int i  = str.length()-1; i >= 0; i--){
			str1 += str.charAt(i);
		}
		//print the reversed string
		System.out.println("Your reversed string is "+ str1);
	}
	public static void main(String args[]){
		
		//create an instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//get input string from user
		System.out.println("Enter your string: ");
		String str = input.nextLine().trim();
		
		//call reverseString method to get the revrsed string 
		reverseString(str);
		
		//close scanner
		input.close();
	}
}