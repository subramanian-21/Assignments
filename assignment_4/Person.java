package assignment_4;
class Main{
    /**
     * . Create a class named Person. Overload the constructors such that first 
     * constructor takes a single String argument for the name, second takes a 
     * String argument for the name and an int argument for the age and third 
     * constructor takes a String argument for the name, an int argument for the 
     * age, and a String argument for the address.
     */
    public static void main(String[] args) {
        Person person = new Person("Subramanian",21,"chennai");
        System.out.println(person.name+" "+person.age+" "+person.address);
    }
}
public class Person {
    public String name;
    public int age;
    public String address;
    public Person(String name) {
        this.name = name;
    }
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name,int age,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
}
