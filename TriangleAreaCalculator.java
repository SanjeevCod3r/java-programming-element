import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base and height of the triangle
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble();

        // Calculate the area of the triangle in square centimeters
        double areaCm2 = 0.5 * base * height;

        // Convert the area from square centimeters to square inches
        double areaIn2 = areaCm2 * 0.1550;

        // Output the results
        System.out.println("The area of the triangle is " + areaCm2 + " square centimeters and " + areaIn2 + " square inches.");

       }
}
