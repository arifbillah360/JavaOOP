package MyFirstJavaPractice;
public class methodOverloading {
    static int plusMehtodInt( int x, int y){
        return x+y;
    }
    static double plusMethodDouble(double x, double y){
        return x+y;
    }

    public static void main(String[] args){
        int myNum = plusMehtodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.256);
        System.out.println("Int " + myNum);
        System.out.println("Double " + myNum2);

    }
}
