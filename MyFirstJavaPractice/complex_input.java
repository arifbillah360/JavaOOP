package MyFirstJavaPractice;
import java.util.Scanner;

class complex_input{
    public void MFI(){
        //int eid;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number");
        int id = input.nextInt();
        System.out.print("The Entered number is : " + id);
        input.close();
    }
}