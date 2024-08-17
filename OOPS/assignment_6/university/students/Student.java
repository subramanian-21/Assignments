package OOPS.assignment_6.university.students;

public abstract class Student {
    protected String studentId;
    protected String name;
    protected int age;
    protected String department;

    public Student(String studentId, String name, int age, String department) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public abstract void displaySpecialization();

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}

