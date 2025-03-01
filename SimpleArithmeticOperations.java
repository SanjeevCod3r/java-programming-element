import java.util.Scanner;

public class SimpleArithmeticOperations {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Output the results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " 
                           + multiplication + ", and " + division);
    }
}
