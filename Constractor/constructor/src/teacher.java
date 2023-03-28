public class teacher {
    String name, gender;
    int phone;

   /* //No need this if we use constructor
    void setInformation(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    } */
    teacher(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }
      
        void displayInformation(){
            System.out.println("Name:" + name);
            System.out.println("Gender:" + gender);
            System.out.println("Phone:" + phone);
            System.out.println("\n");
        }
}
