import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        int i, flag = 0;
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.close();
        if(n ==0 || n == 1)
            flag = 1;
        
            for(i=2; i<= n/2; ++i){
                if(n%i ==0){
                    flag = 1; 
                    break;
                }                
            }
        if (flag == 0){
            System.out.println( "This is a prime number ");
        }
        else{
            System.out.println( "This is a not prime number ");

        }
            


    }
}
