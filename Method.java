public class Method {
    public static void myMethod(){
        int x=5;
        int y=10;
        int z = x+y;
        System.out.println( "This is a number " + z);
    }
    public static void myMethod2(){
        System.out.println("Hello world");
    }
    public static void main(String[] args){
        myMethod2();
        myMethod();
    }
}
