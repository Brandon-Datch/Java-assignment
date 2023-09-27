import java.util.Scanner;

public class overallResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter your marks for sub 1: ");
        int sub1 = scanner.nextInt();
        System.out.print("Enter your marks for sub 2: ");
        int sub2 = scanner.nextInt();
        System.out.print("Enter your marks for sub 3: ");
        int sub3 = scanner.nextInt();
        int total = sub1 + sub2 + sub3;
        double average = (double) total / 3;
        String grade;

        if (average >= 80 && average <= 100) {
            grade = "A";
        } else if (average >= 75 && average < 80) {
            grade = "B+";
        } else if (average >= 65 && average < 75) {
            grade = "B";
        } else if (average >= 55 && average < 65) {
            grade = "C+";
        } else if (average >= 50 && average < 55) {
            grade = "C";
        } else if (average >= 40 && average < 50) {
            grade = "D";
        } else if (average >= 0 && average < 40) {
            grade = "F";
        } else {
            grade = "INVALID";
        }

        System.out.println("\t \t \t\tOverall results");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("STUDENT NAME:\t\tSUB1:\t\tSUB2:\t\tSUB3:\t\tTOTAL:\t\tAVERAGE\t\tGRADE%n");
        System.out.printf("\t\t%s\t\t\t%d\t\t\t%d\t\t\t%d\t\t\t%d\t\t\t%.2f\t\t%s%n", studentName, sub1, sub2, sub3, total, average, grade);

        scanner.close();
    }
}
