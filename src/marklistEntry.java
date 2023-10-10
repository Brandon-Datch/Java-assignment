import java.util.Scanner;

public class marklistEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        String[][] studentData = new String[numStudents][9]; // Added RESULT column at index 8

        for (int i = 0; i < numStudents; i++) {
            studentData[i][0] = "10" + (i + 1);
            System.out.printf("Roll number: %s\n", studentData[i][0]);
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentData[i][1] = scanner.next();
            int total = 0;

            for (int j = 2; j < 5; j++) {
                System.out.print("Enter marks for subject " + (j - 1) + " for " + studentData[i][1] + ": ");
                int marks = scanner.nextInt();
                studentData[i][j] = String.valueOf(marks);
                total += marks;
            }

            double average = total / 3.0;
            String formatAverage = String.format("%.2f", average);
            studentData[i][5] = String.valueOf(total);
            studentData[i][6] = String.valueOf(average);

            if (average >= 70) {
                studentData[i][7] = "A";
            } else if (average >= 50) {
                studentData[i][7] = "B";
            } else {
                studentData[i][7] = "C";
            }

            studentData[i][8] = (average >= 50) ? "P" : "F";

            System.out.println("Total Marks for " + studentData[i][1] + ": " + total);
            System.out.println("Average for " + studentData[i][1] + ": " + average);
            System.out.println("Grade for " + studentData[i][1] + ": " + studentData[i][7]);
            System.out.println("RESULT for " + studentData[i][1] + ": " + studentData[i][8]);
            System.out.println("------------------------------------------------------------");
        }

        System.out.println("*********************************************************************************");
        System.out.println("\n\t\t\tSTUDENT MARKLIST:");
        System.out.println("*********************************************************************************");
        System.out.printf("%-10s%-15s%-10s%-10s%-10s%-15s%-10s%-10s%-10s\n", "Roll No", "Name", "Subject 1", "Subject 2", "Subject 3", "Total", "Average", "Grade", "RESULT");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10s%-15s%-10s%-10s%-10s%-15s%-10s%-10s%-10s\n", studentData[i][0], studentData[i][1],
                    studentData[i][2], studentData[i][3], studentData[i][4], studentData[i][5], studentData[i][6], studentData[i][7], studentData[i][8]);
        }
        scanner.close();
    }
}
