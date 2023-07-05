public class App extends Thread {
    public void run(){
        System.out.println("Running Thread name: "+ Thread.currentThread().getName());
    }
}
class MyThread5{
    public static void main(String args[]){
        App obj1 = new App();
        App obj2 = new App();

        System.out.println("P1 thread priority :" + obj1.getPriority());
        System.out.println("P thread priority :" + obj2.getPriority());

        obj1.start();
        obj2.start();
    }
}
