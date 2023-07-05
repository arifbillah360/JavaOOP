class Multi implements Runnable{
    public void run() {
        System.out.println("Running!!");
        System.out.println("Im Happy!");
        System.out.println();
    }
}
class Multi2 implements Runnable{
    public void run() {
        System.out.println("Im Sad!");
    }
}
class main{
    public static void main(String args[]){
        Multi obj = new Multi();
        Thread t1 = new Thread(obj);
        t1.start();

        Multi obj2 = new Multi();
        Thread t2 = new Thread(obj2);
        t1.start();
        
    }
}
