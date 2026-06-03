import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Check if number is less than or equal to 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check divisibility
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print result
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
            
} else {
            System.out.println(num + " is not a Prime Number");
        }

        sc.close();
    }
}

