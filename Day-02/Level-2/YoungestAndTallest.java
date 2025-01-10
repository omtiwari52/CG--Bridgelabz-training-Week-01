import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {

        // Declaring Scanner class instance
        Scanner input = new Scanner(System.in);

        // Get the amar age 
        System.out.print("Enter amar age: ");
        int amarAge = input.nextInt();
		
		// Get the amar height 
        System.out.print("Enter amar height in (cm): ");
        int amarHeight = input.nextInt();
		
		// Get the akbar age 
        System.out.print("Enter akbar age: ");
        int akbarAge = input.nextInt();
		
		// Get the akbar age 
        System.out.print("Enter akbar height in (cm): ");
        int akbarHeight = input.nextInt();
		
		// Get the anthonyAge age 
        System.out.print("Enter anthony age: ");
        int anthonyAge = input.nextInt();
		
		// Get the anthony height 
        System.out.print("Enter anthony height in (cm): ");
        int anthonyHeight = input.nextInt();
		
		//Computing the youngest person and diplay its name

        if((amarAge < akbarAge) && (amarAge < anthonyAge)) System.out.println("Amar is youngest person");
        else if((akbarAge < amarAge) && (akbarAge < anthonyAge)) System.out.println("Akbar is youngest person");
        else if((anthonyAge < amarAge) && (anthonyAge < akbarAge)) System.out.println("Anthony is youngest person");
		
		//Computing the tallest person and diplay its name

        if((amarHeight > akbarHeight) && (amarHeight > anthonyHeight)) System.out.println("Amar is tallest person");
        else if((akbarHeight > amarHeight) && (akbarHeight > anthonyHeight)) System.out.println("Akbar is tallest person");
        else if((anthonyHeight > amarHeight) && (anthonyHeight > akbarHeight)) System.out.println("Anthony is tallest person");

        // Closing the scanner
        input.close();
	}
}