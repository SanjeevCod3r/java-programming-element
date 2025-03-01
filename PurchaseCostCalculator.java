import java.util.Scanner;

public class PurchaseCostCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the unit price of the item
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();

        // Prompt the user to enter the quantity to be bought
        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.println("The total purchase price is INR " + totalPrice 
                           + " if the quantity is " + quantity 
                           + " and the unit price is INR " + unitPrice);

    }
}

