package AAS;

//this this is test class. we will call 2 constrator. and this called overloading
public class test5{
    public static void main(String[] args){
        //1st make object and initialize the value. then load the constructor not override
        /* you see i crate 3 constructor with diffrent parameter also call */
        isBoxConsOver myBoxObj1 = new isBoxConsOver(10.0, 20.0, 15.0); 
        isBoxConsOver myBoxObj2 = new isBoxConsOver();
        isBoxConsOver myBoxobj3 = new isBoxConsOver(15.5);

        double vol;
        //
        //1st overloading
        vol = myBoxObj1.volume();
        System.out.print("Volume ofmybox is " + vol );
        
        //2nd overloading
        vol = myBoxObj2.volume();
        System.out.print("Volume ofmybox is " + vol );

        //3rd overloading
        vol = myBoxobj3.volume();
        System.out.print("Volume ofmybox is " + vol );

    }
}