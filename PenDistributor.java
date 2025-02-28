public class PenDistributor {
    public static void main(String[] args) {
        // Given number of pens and number of students
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate the number of pens each student gets
        int pensPerStudent = totalPens / totalStudents;

        // Calculate the remaining pens using the modulus operator
        int remainingPens = totalPens % totalStudents;

        // Output the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
