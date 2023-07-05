public class Sleep implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

class test{
    public static void main(String args[]){
        Sleep obj1 = new Sleep();
        Thread th1 = new Thread(obj1);
        Sleep obj2 = new Sleep();
        Thread th2 = new Thread(obj2);

        th1.start();
        th2.start();


    }
}
