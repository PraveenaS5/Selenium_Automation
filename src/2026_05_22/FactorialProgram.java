import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int factorial = 1;

        // Calculate factorial using loop
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        // Print result
        System.out.println("Factorial of " + num + " is: " + factorial);

        sc.close();
    }
}