import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Check if the number of students is valid
        if (numberOfStudents < 2) {
            System.out.println("There should be at least 2 students to have handshakes.");
        } else {
            // Calculate the maximum number of handshakes using the combination formula
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Output the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);
        }
    }
}
