public class GetPrioriity extends Thread {
    public void run(){
        System.out.println("Running Thread name: "+ Thread.currentThread().getName());
    }
}
class MyThread5{
    public static void main(String args[]){
        GetPrioriity obj1 = new GetPrioriity();
        GetPrioriity obj2 = new GetPrioriity();

        System.out.println("P1 thread priority :" + obj1.getPriority());
        System.out.println("P thread priority :" + obj2.getPriority());

        obj1.start();
        obj2.start();
    }
}
