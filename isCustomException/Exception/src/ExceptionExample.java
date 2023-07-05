//usage of throws and throw

import java.io.IOException;

public class ExceptionExample {
    public void methodA() throws IOException {
        throw new IOException("IOException occurred in method A");
    }

    public void methodC() {
        try {
            methodA();
        } catch (IOException ex) {
            System.out.println("Caught IOException: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        example.methodC();
    }
}
