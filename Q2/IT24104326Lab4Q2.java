import java.util.Scanner;

public class IT24104326Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input exam marks
        System.out.print("Please enter the exam marks (out of 100): ");
        int examMarks = input.nextInt();

        // Checking the  exam marks
        if (examMarks >= 0 && examMarks <= 100) {
            // if its is valid Input lab submission marks
            System.out.print("Enter the Lab Submission Marks (out of 100): ");
            int labMarks = input.nextInt();

            // Validate lab marks
            if (labMarks < 0 || labMarks > 100) {
                System.out.print("Invalid Lab Submission Marks. Terminating the program.");
            } else {
                // Input percentages
                System.out.print("Enter the percentage given for the exam: ");
                double examPercentage = input.nextDouble();

                System.out.print("Enter the percentage given for the lab exam: ");
                double labPercentage = input.nextDouble();

                // Validate percentages
                if (examPercentage + labPercentage != 100) {
                    System.out.print("Invalid percentages! Percentages must add up to 100. Terminating the program.");
                } else {
                    // Calculate and display final marks
                    double finalExamMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
                    System.out.println("Final Marks: " + finalExamMarks);
                }
            }
        } else {
            System.out.print("Invalid Exam Marks. Terminating the program.");
        }

        input.close();
    }
}