// including scanner package
import java.util.Scanner;

public class KilometersToMilesAdvance{
      public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            System.out.print("Enter distance in Km : ");
           
            //creating a double variable to take input of distance in kilometers
            double km = input.nextDouble();

            //creating a double variable to calculate distance in kilometers which may come in decimal
             double distanceInMiles = km * 1.6;
             System.out.println("The distance " + km + " km in miles is " + distanceInMiles);
            input.close();

       }
}
