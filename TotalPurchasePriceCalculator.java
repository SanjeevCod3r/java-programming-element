import java.util.Scanner;

public class TotalPurchasePriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the unit price of the item
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();

        // Prompt the user to enter the quantity to be bought
        System.out.print("Enter the quantity of the item: ");
        int quantity = input.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

    }
}
