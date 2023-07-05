public class JoinExample extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class main13{
    public static void main(String[] args) {
        JoinExample j1=new JoinExample();
        JoinExample j2=new JoinExample();
        JoinExample j3=new JoinExample();
         j1.start();
       try{
           j1.join();
       }catch(Exception e){
           System.out.println(e);
        }
       j2.start();
       j3.start();
    }
}