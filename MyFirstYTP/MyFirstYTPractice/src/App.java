import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner(System.in);
        double base, height;
        
        System.out.print("Enter Base: ");
        base = x.nextDouble();
        
        System.out.print("Enter Height: ");
        height = x.nextDouble();

        String a = "Thsi is a String";

        double total = base + height;
        System.out.print("Total sum of Base and Height: " + total);
        System.out.print(a);


    }
}
