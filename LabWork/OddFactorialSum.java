package LabWork;
import java.util.Scanner;

public class OddFactorialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            int factorial = 1;

            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            sum += factorial;
        }

        System.out.println("The sum of the factorial of odd numbers up to " + n + " is " + sum);

        scanner.close();
    }
}
