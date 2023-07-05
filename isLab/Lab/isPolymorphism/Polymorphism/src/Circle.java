public class Circle extends shape {
    final double PI = 3.1416;
    @Override
    void print_shape() {
        System.out.println("Circle");
    }
    void area(double r){
        System.out.print("Circlee area : " + (PI*Math.pow(r,2)));
    }
}
