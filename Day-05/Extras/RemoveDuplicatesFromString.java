import java.util.Scanner;
public class RemoveDuplicatesFromString{
	
	//create a method to reverse a string
	public static void removeDuplicates(String str){
		
		String str1 = "";
		for(int i = 0; i < str.length(); i++){
			
			String ch = String.valueOf(str.charAt(i));
			if(!str1.contains(ch)){
				str1 += str.charAt(i);
			}
		}
		System.out.println("Your new String is: "+ str1);
	}
	public static void main(String args[]){
		
		//create an instance of scanner class
		Scanner input = new Scanner(System.in);
		
		//get input string from user
		System.out.println("Enter your string: ");
		String str = input.nextLine().trim();
		
		//call reverseString method to get the revrsed string 
		removeDuplicates(str);
		
		//close scanner
		input.close();
	}
}