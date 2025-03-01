import java.util.Scanner;

public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output the results
        System.out.println("The Quotient is " + quotient + " and the Remainder is " + remainder 
                           + " of two numbers " + number1 + " and " + number2);
    }
}
