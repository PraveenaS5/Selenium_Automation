import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        // Check pass or fail
        if (marks >= 40) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }

        sc.close();
    }
}
