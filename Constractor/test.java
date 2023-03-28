package Constractor;

public class test {
    public static void main(String[] args){
    //With constructor
    teacher teacher1 = new teacher("Arif", "Male", 1779440297);
    teacher1.displayInformation();

    teacher teacher2 = new teacher("Anika", "female", 440297);
    teacher2.displayInformation();
}


    /* 
    //Without Constructor
    public static void main(String[] args){
        teacher teacher1 = new teacher();
        teacher1.setInformation("Arif", "Male", 1779440297);
        teacher1.displayInformation();

        teacher teacher2 = new teacher();
        teacher2.setInformation("Anika", "female", 440297);
        teacher2.displayInformation();
    }*/
}

