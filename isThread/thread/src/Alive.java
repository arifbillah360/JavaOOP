
public class Alive extends Thread{
    public void run(){
        try{
            Thread.sleep(300);
            System.out.println("is run() method isAlive: "+Thread.currentThread().isAlive());
        }catch(Exception e){

        }
    }
}
class main15{
    public static void main(String[] args) {
        Alive a1=new Alive();
        System.out.println("before starting : "+a1.isAlive());
        a1.start();
        System.out.println("After starting: "+a1.isAlive());
    }
}