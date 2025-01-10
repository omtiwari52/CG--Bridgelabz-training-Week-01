// including scanner package
import java.util.Scanner;

public class DiscountedCollegeFeeAdvance{
      public static void main(String[] args){
               
              Scanner input = new Scanner(System.in);
           
            System.out.print("Enter College Fee : ");
            //Creating int variable to take input of college fee
            int fee = input.nextInt();

            System.out.print("Enter discount percent : ");
            //Creating int variable to take input of discount percent
                int discountPercent = input.nextInt();

             // creating a int variable discountAmount to store the discounted amount
                int discountAmount = (fee * discountPercent)/100 ;

             // creating a int variable discountedPrice to store the fee of student after discount
                int discountedPrice = fee - discountAmount;

                System.out.println("The discount amount is INR "+ discountAmount + " and final discounted fee is INR "+  discountedPrice);
               input.close();
      }
}