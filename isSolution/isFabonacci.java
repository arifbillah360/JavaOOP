package isSolution;
import java.util.Scanner;
public class isFabonacci {
    public void Fibonacci(){
        int t1=0, t2 =1;
        Scanner Finput = new Scanner(System.in);
        int nextTerm = t1+ t2;
        System.out.println("Enter the number: ");
        int n = Finput.nextInt();
        Finput.close();

        System.out.print("The Fibonacci Series is:  " + t1 + " " + t2);
       
        for(int i=3; i<=n; i++){
            System.out.print(" " + nextTerm);
            t1 = t2;
            t2 = nextTerm;
            nextTerm = t1 + t2;
        }
    }
/*     public static void main(String[] args){
        isFabonacci myFib = new isFabonacci();
        myFib.Fibonacci();
    }*/
}
