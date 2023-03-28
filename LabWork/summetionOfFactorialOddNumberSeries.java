package LabWork;
public class summetionOfFactorialOddNumberSeries
    {
    int x,n;
    double sum;
    void SeriesSum(int xx,int nn)
    { 
    x=xx;
    n=nn;
    sum=0.0;
    }
    double findfact(int a)
    { 
        return (a<2)? 1:a*findfact(a-1);
    }
    double findpower(int a, int b)
    { 
        return (b==0)? 1:a*findpower(a,b-1);
    }
    void calculate()
    { 
        System.out.println("x ="+x);    
        System.out.println("n ="+n);    
        for(int i=2;i<=n;i+=2){

            System.out.println(x+"^"+i+"/"+(i-1)+"!" +" = " +(findpower(x,i)+"/"+findfact(i-1)) );
            //System.out.println(findpower(x,i)+"/"+findfact(i-1));

            sum += findpower(x,i)/findfact(i-1);
        }
    }
    void display()
    { 
        System.out.println("sum="+ sum);
    }
    public static void main(String[] args)
    { 
    SeriesSum obj = new SeriesSum(3,8);
    obj.calculate();
    obj.display();
    }
}