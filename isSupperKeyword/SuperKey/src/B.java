public class B extends A{
    int i;
    B(int a, int b){
        super.i = a;
        i=b;
    }
    void show(){
        System.out.println("I in superclass: " + super.i);
        System.out.println("I in sub class: " + i);
    }
}
