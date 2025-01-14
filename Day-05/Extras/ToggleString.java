import java.util.Scanner;
public class ToggleString{
	//create a method to reverse a string
	public static void toggleCase(String str){
		
		//create a variable to store the revrsed string
		String str1 = "";
		for(int i  = 0 ; i < str.length(); i++){
		char ch = str.charAt(i);
			if(ch >= 97){
				str1 += (char)(ch - 32);
			}
			else if(ch == ' '){
				str1 += " ";
			}
			else{
				str1 += (char)(ch + 32);
			}
		}
		//print the toggled string
		System.out.println("Your toggled string is "+ str1);
	}
	public static void main(String args[]){
		
		//create an instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//get input string from user
		System.out.println("Enter your string: ");
		String str = input.nextLine().trim();
		
		//call reverseString method to get the revrsed string 
		toggleCase(str);
		
		//close scanner
		input.close();
	}
}