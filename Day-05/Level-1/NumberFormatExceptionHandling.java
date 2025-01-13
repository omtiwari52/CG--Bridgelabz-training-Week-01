import java.util.Scanner;
import java.lang.Integer;
public class NumberFormatExceptionHandling{
	// Method that generate the exception
	public static void generateException(String text){
		Integer.parseInt(text);
	}
	
	//Method that handle the exception
	public static void HandleException(String text){
		try{
			// This may give the exception0
			Integer.parseInt(text);
		}
		catch(NumberFormatException e){
			System.out.println("Caught NumberFormatException : "+ e.getMessage());
		}
	}
	
	//main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();
		
		try{
			generateException(text);
		}catch(NumberFormatException e){
			System.out.println("Caught NumberFormatException : "+ e.getMessage());
		}catch(RuntimeException e){
			System.out.println("Caught RuntimeException : "+ e.getMessage());
		}
		
		HandleException(text);
		
		//close scanner 
		input.close();
	}
}