interface Share{
    void share(String Name, double dollar);
}

class Manege implements Share{
    public void share(String s, double p){
        double totalAmount = 100;
        double x = (p/100) * totalAmount;
        System.out.println(s + " wiil get: " + x);
    }
}
public class App{
        public static void main(String args[]){
            double totalAmount = 300;
        Share t = new Manege();
        t.share("Sumaia", 20);
        t.share("Kajol",30);
        t.share("Arif", 50);
    }
}
