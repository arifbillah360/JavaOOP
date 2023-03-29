public class VersityInformation {
    String name, Dept;
    int Id;
    
    VersityInformation(){
        System.out.println("No student data found! ");
    }
    VersityInformation(String n){
        this.name = n;
    }
    VersityInformation(String n, String d, int I){
        this.name = n;
        this.Dept = d;
        this.Id = I;
    }

    void DisInformation(){
        System.out.println("Name: " + name);
        System.out.println("Dept: " + Dept);
        System.out.println("Id: " + Id);
    }

}
