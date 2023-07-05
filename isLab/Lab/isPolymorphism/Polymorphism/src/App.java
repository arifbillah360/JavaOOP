public class App {
    public static void main(String[] args) throws Exception {
        Circle c = new Circle();
        c.print_shape();
        c.area(3.00);


        Tetragon t = new Tetragon("Tetragon");
        t.print_shape();;
        t.area(2);
        t.area(2, 3);
    }
}
