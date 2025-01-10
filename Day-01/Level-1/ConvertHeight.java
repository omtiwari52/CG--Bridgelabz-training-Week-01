// including scanner package
import java.util.Scanner;

public class ConvertHeight{
      public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter height in Cm : ");
           
            //creating a double variable to take input of height in Centimeters
            double heightInCentimeters = input.nextDouble();

            //creating a double variable to calculate and store result of height in inches
            double heightInInches = heightInCentimeters / 2.54 ;

            //creating a double variable to calculate and store result of height in feet
            double heightInFeet = heightInInches / 12 ;

             System.out.println("Your Height in cm is "+ heightInCentimeters + " while in feet is "+ heightInFeet + " and inches is "+ heightInInches);
           input.close();
       }
}
