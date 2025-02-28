public class DiscountCalculator {
    public static void main(String[] args) {
        // Given course fee and discount percentage
        int fee = 125000;
        int discountPercent = 10;
        
        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100.0;
        
        // Calculate the final discounted fee
        double finalFee = fee - discount;
        
        // Output the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
