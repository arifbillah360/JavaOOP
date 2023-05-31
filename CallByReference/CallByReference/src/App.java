public class App {
    public static void main(String[] args) throws Exception {
        CallByReference obj = new CallByReference();
        obj.name = "Arif";
        System.out.println("Befor calling: " + obj.name);

        obj.change(obj);
        System.out.print("After calling: " + obj.name);        
    }
}
