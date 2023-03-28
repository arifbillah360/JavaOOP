package isSolution;
import java.util.Scanner;
public class isPrime {
    public void Prime(){
        int flag=0;
        Scanner Ainput = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = Ainput.nextInt();

        for(int i=2; i<=n/2; i++){
            if(n % 2 == 0){
                flag = 1;
            }
        }
        if(flag == 0)
            System.out.print("Then number is Prime");
        else
            System.out.print("Then number is not a Prime");
        Ainput.close();
    }
}
