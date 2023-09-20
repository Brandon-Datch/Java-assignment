import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student number: ");
        int empNo = scanner.nextInt();
        System.out.print("Enter your name: ");
        String studentName = scanner.next();
        System.out.print("Enter your marks for sub 1: ");
        int sub1 = scanner.nextInt();
        System.out.print("Enter your marks for sub 2: ");
        int sub2 = scanner.nextInt();
        System.out.print("Enter your marks for sub 3: ");
        int sub3 = scanner.nextInt();
        System.out.print("Enter your marks for sub 4: ");
        int sub4 = scanner.nextInt();
        System.out.print("Enter your marks for sub 5: ");
        int sub5 = scanner.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = (double) total / 5;

        System.out.println("\t \t \t\tWelcome to Student Marks List Application");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("S.No:\t\tSTUDENT NAME:\t\tSUB1:\t\tSUB2:\t\tSUB3:\t\tSUB4:\t\tSUB5:\t\tTOTAL:\t\tAVERAGE%n");
        System.out.printf("\t%d\t\t\t%s\t\t\t%d\t\t\t%d\t\t\t%d\t\t\t%d\t\t\t%d\t\t\t%d\t\t\t%.2f%n",
                empNo, studentName, sub1, sub2, sub3, sub4, sub5, total, average);

        scanner.close();
    }
}
