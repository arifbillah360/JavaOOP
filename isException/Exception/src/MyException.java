public class MyException {
    public static void main(String[] args) {
        try{
            int x=10;
            int y=0;
            int result=x/y;
            System.out.println(result);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: "+e);
        }catch(ArithmeticException e2){
            System.out.println("Exception2; "+e2);
        }
            System.out.println("This is the last line of the program!");


    }
}
