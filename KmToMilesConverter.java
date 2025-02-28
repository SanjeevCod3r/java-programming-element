import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Conversion factor: 1 mile = 1.6 km
        double miles = km / 1.6;

        // Output the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        // Close the scanner object to prevent resource leaks
        input.close();
    }
}
