public class CallByValueExample{

    public static void main(String[] args){
        int num = 10;
        System.out.println("Befor " + num);
        ChangeValue(num);
        System.out.println("After " + num);
    }

    public static void ChangeValue(int value){
        value = 20;
        System.out.println("Value inside method: " + value);
    }
    // 10 10 20

}