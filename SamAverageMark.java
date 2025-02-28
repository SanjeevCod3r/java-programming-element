public class SamAverageMark {
    public static void main(String[] args) {
        // Given marks in Maths, Physics, and Chemistry
        int marksMaths = 94;
        int marksPhysics = 95;
        int marksChemistry = 96;

        // Maximum marks for each subject
        int maxMarks = 100;

        // Calculate the total marks
        int totalMarks = marksMaths + marksPhysics + marksChemistry;

        // Calculate the average percentage
        double averagePercentage = (totalMarks / 3.0);

        // Output the result
        System.out.println("Sam's average mark in PCM is " + averagePercentage + "%");
    }
}
