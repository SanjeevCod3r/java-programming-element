import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert the height in centimeters to inches
        double heightInches = heightCm / 2.54;

        // Convert the height in inches to feet
        int feet = (int) (heightInches / 12);

        // Calculate the remaining inches
        int inches = (int) (heightInches % 12);

        // Output the result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);

        // Close the scanner object to prevent resource leaks
        input.close();
    }
}
