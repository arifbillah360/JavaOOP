//package isSolution;
public class isSumFact {
    public int SumFact(){
       int f = 1, Sum = 0;
        int n = 5;
       for(int i=1; i<= n; i++){
            f = f*i;
            Sum +=f;
       }
       return Sum;
    }
    public static void main(String[] args){
            isSumFact mySF = new isSumFact();
            mySF.SumFact();
            System.out.print("The Number " + mySF.SumFact());
        }
}
