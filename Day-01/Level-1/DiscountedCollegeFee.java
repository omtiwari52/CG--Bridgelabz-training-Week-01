public class DiscountedCollegeFee{
      public static void main(String[] args){
               
              // creating a int variable fee to store the fee of student 
                int fee = 125000;

             // creating a int variable discountPercent
                int discountPercent = 10;

             // creating a int variable discountAmount to store the discounted amount
                int discountAmount = (fee * 10)/100 ;

             // creating a int variable discountedPrice to store the fee of student after discount
                int discountedPrice = fee - discountAmount;

                System.out.println("The discount amount is INR "+ discountAmount + " and final discounted fee is INR "+  discountedPrice);
      }
}