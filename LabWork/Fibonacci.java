package LabWork;
import java.util.Scanner;
public class Fibonacci {
 
    public static void Fibonacci(String[] args){
        int n, a=0, b=0, c=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n = s.nextInt();
        System.out.println("Fibonacci Series: ");

        for(int i = 1; i <= n; i++){
            a = b;
            b = c;
            c = a+b;
            System.out.println(a + " ");
        }
    }
}
