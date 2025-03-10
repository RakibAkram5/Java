import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            // Variables
            System.out.print("Enter the student's name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter the number of subjects: ");
            int numberOfSubjects = scanner.nextInt();

            double totalScore = 0;

            // Input scores using a loop
            for (int i = 1; i <= numberOfSubjects; i++) {
                System.out.print("Enter score for subject " + i + ": ");
                double subjectScore = scanner.nextDouble();
                totalScore += subjectScore;
            }

            // Calculate average
            double average = totalScore / numberOfSubjects;

            // Determine grade using condition statements
            String grade;
            if (average >= 85) {
                grade = "A";
            } else if (average >= 70) {
                grade = "B";
            } else if (average >= 50) {
                grade = "C";
            } else {
                grade = "F";
            }

            // Display results
            System.out.println("\nStudent Name: " + studentName);
            System.out.println("Total Score: " + totalScore);
            System.out.println("Average Score: " + average);
            System.out.println("Grade: " + grade);

            // Check if the user wants to calculate grades for another student
            System.out.print("\nDo you want to calculate for another student? (y/n): ");
            continueChoice = scanner.next().charAt(0);

            // Clear the buffer
            scanner.nextLine();

        } while (continueChoice == 'y' || continueChoice == 'Y');

        System.out.println("Thank you for using the Student Grade Calculator!");
        scanner.close();
    }
}
