public class CalculateProfitLoss{
      public static void main(String[] args){
            //creating a int variable to store cost price 
             int costPrice = 129;
            //creating a int variable to store selling price 
             int sellingPrice = 191;
            //creating a int variable to claculate and store profit 
             int profit = sellingPrice - costPrice;
            //creating a float variable to store profit percentage 
             float profitPercentage = (profit  * 100 ) / costPrice;
             System.out.println("The Cost Price is INR "+ costPrice +" and Selling Price is INR "+ sellingPrice + " \nThe Profit is INR " + profit + " and the Profit Percentage is "+ profitPercentage );
       }
}
