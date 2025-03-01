import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle in centimeters
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble();

        // Prompt the user to enter the height of the triangle in centimeters
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble();

        // Calculate the area of the triangle in square centimeters
        double areaInCm2 = 0.5 * base * height;

        // Convert the area from square centimeters to square inches
        double areaInInches2 = areaInCm2 / 6.4516;

        // Output the results
        System.out.println("The area of the triangle is " + areaInInches2 + " square inches and " + areaInCm2 + " square centimeters.");
    }
}
