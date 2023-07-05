public class Tetragon extends shape {
    String s;

    Tetragon (String s){
        this.s=s;
    }
    void print_shape(){
        System.out.println(this.s);
    }
    void area(double a){
        System.out.println("Square " + Math.pow(a,2));
    }
    void area(double a , double b){
        System.out.println("Rectangle: " + (a*b));
    }
}
