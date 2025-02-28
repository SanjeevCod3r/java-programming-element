import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the fee
        System.out.print("Enter the student fee (in INR): ");
        double fee = input.nextDouble();

        // Prompt the user to enter the discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100.0;

        // Calculate the final discounted fee
        double finalFee = fee - discount;

        // Output the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
