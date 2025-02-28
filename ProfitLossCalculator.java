public class ProfitLossCalculator {
    public static void main(String[] args) {
        // Given cost price and selling price
        double costPrice = 129;
        double sellingPrice = 191;
        
        // Calculate the profit
        double profit = sellingPrice - costPrice;
        
        // Calculate the profit percentage
        double profitPercentage = (profit / costPrice) * 100;
        
        // Output the result using a single print statement for multiline text
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                           "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
}
