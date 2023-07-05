package LabWork;
import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = s.nextInt();

        if(number % 2 == 0){
            System.out.println( number + "The number is Evan");
        }else{
            System.out.println( number + "The number is Odd");
        }
    }
}
