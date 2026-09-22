package Group41;
import java.util.Scanner;

public class StudentGradeManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] students = {
                "Rama",
                "Jacinta",
                "Alvin",
                "Biira",
                "Joshua"
        };

        int[] marks = new int[students.length];

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println(" STUDENT GRADE MANAGEMENT SYSTEM ");
            System.out.println("=================================");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Results");
            System.out.println("3. Calculate Average");
            System.out.println("4. Exit");
            System.out.print("Choose Option: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\nENTER STUDENT MARKS");

                    for (int i = 0; i < students.length; i++) {

                        System.out.print("Enter mark for " + students[i] + ": ");
                        marks[i] = input.nextInt();

                        // While Loop Validation
                        while (marks[i] < 0 || marks[i] > 100) {
                            System.out.print("Invalid mark. Enter again: ");
                            marks[i] = input.nextInt();
                        }
                    }

                    System.out.println("Marks Saved Successfully!");
                    break;

                case 2:

                    System.out.println("\n===== STUDENT RESULTS =====");

                    for (int i = 0; i < students.length; i++) {

                        String status =
                                (marks[i] >= 50) ? "PASS" : "FAIL"; // Ternary Operator

                        String grade;

                        if (marks[i] >= 80)
                            grade = "A";
                        else if (marks[i] >= 70)
                            grade = "B";
                        else if (marks[i] >= 60)
                            grade = "C";
                        else if (marks[i] >= 50)
                            grade = "D";
                        else
                            grade = "F";

                        System.out.println(
                                students[i]
                                        + " | Mark: "
                                        + marks[i]
                                        + " | Grade: "
                                        + grade
                                        + " | "
                                        + status);
                    }

                    break;

                case 3:

                    int total = 0;

                    for (int i = 0; i < marks.length; i++) {
                        total += marks[i];
                    }

                    double average = (double) total / marks.length;

                    System.out.println("\n===== CLASS SUMMARY =====");
                    System.out.println("Total Marks = " + total);
                    System.out.println("Average Mark = " + average);

                    break;

                case 4:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid Option!");
            }

        } while (choice != 4); // Do-While Loop

        input.close();
    }
}
