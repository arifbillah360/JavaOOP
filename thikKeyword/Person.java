package thikKeyword;

public class Person{
   String name;
   int age;
   Person(String name, int age){
      this.name = name;
      this.age = age;
 }
   /* 
   Person(String p, int a){
        name = p;
        age = a;
   }
   */
   void Display(){
    System.out.println("Name " + name); 
    System.out.println("Age " + age); 
   }
}

