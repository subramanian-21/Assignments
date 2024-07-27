package assignment_4;
public class MainPerson {
    public static void main(String[] args) {
        Person p1 = new Person("abcd");
        Person p2 = new Person("efgh",10); 
        Person p3 = new Person("ijkl",21,"chennai");

        System.out.println(p1.name +" "+p1.age+" "+p1.address);
        System.out.println(p2.name +" "+p2.age+" "+p2.address);
        System.out.println(p3.name +" "+p3.age+" "+p3.address);

    }
   
    
}
