package MyFirstJavaPractice;
import java.util.Scanner;

class MyfirstInput{
    public void main(){
        int number, demo=2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number");
        number = input.nextInt();
        System.out.print("The number is : " + number);
    }
}