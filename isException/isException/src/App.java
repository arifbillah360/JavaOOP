public class App {
    public static void main(String[] args) throws Exception {
        try{
            int x = 10;
            int y = 0;
            int result = x/y;
            System.out.println("Result: " + result);
        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Exception:  " + e1);
        } catch(ArithmeticException e){
            System.out.println("Exception:  " + e);
        } catch(Exception e2){
         System.out.println("Exception:  " + e2);           
        }
        finally{
            System.out.println("Last line of the program");
        }
    }
}
