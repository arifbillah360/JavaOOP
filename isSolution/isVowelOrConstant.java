package isSolution;
import java.util.Scanner;

public class isVowelOrConstant {
    public void VowelOrConstant(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char ch = input.next().charAt(0);
        input.close();
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is vowel");
        }
        else
            System.out.println(ch + " is Constantent");

    }
}
