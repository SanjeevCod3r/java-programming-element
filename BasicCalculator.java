import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;
        
        // Check to avoid division by zero
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Output the results
        System.out.println("The addition, subtraction, multiplication and division value of " + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " + multiplication + ", " + (number2 != 0 ? division : "undefined"));
        
        // Close the scanner object to prevent resource leaks
        input.close();
    }
}
