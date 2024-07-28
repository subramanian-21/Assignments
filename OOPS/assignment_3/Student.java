package OOPS.assignment_3;

/**
 * 2. Design a Student Parent class and ZSGSStudent Child class.
 * Create constructors in both class with varying number of parameters.
 * Call parent constructor from child constructor.
 * Try experimenting by creating child object using parent constructor.
 */
class Student {
    private String name;
    private int age;
    private String id;
    private static int count = 1;

    public Student(String name, int age, int year) {
        this.name = name;
        this.age = age;
        this.id = generateId(year);
        count++;
    }

    public String generateId(int year){
        return "STUDENT"+(int)Math.floor(Math.random()*100)+"-"+count+"/"+year;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }
}

class ZSGSStudent extends Student {
    private final String course;
    private final int year;

    public ZSGSStudent(String name, int age, String course, int year) {
        super(name, age, year);
        this.course = course;
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }
    @Override
    public String toString(){
        return "Name : "+super.getName()+"\nId : "+super.getId()+"\nYear : "+year+"\nCourse : "+course+"\n";
    }

    public static void main(String[] args) {
      // ZSGSStudent stu = new Student("subramanian", 21,2024);
        Student student = new ZSGSStudent("subramanian", 21,"Full stack",2024);
        ZSGSStudent student1 = new ZSGSStudent("subramanian", 21,"Full stack",2024);
        ZSGSStudent student2 = new ZSGSStudent("mani", 20,"mobile development", 2023);
        ZSGSStudent student3 = new ZSGSStudent("jeeva", 22, "testing",  2024);

        System.out.println(student.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
