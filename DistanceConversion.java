import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert feet to miles (1 mile = 5280 feet)
        double distanceInMiles = distanceInFeet / 5280;

        // Output the results
        System.out.println("The distance in yards is " + distanceInYards + " yards and in miles is " + distanceInMiles + " miles.");
    }
}
