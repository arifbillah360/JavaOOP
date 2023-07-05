public class CallByReference {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println("Before: " + person);
        changePerson(person);
        System.out.println("After: " + person);
    }
    
    public static void changePerson(Person p) {
        p.setName("Jane");
        p.setAge(30);
        System.out.println("Person inside method: " + p);
    }
}

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
