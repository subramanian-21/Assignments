package assignment_5;

/**
 * 1. Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses 
 * representing different types of employees such as HourlyEmployee and SalariedEmployee and overload getEmployeeDetails. 
 * Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.
 */
class Main{
    public static void main(String[] args) {
        HourlyEmployee emp1 = new HourlyEmployee("abc", "1", "sd", 10,1000);
        SalariedEmployee emp2 = new SalariedEmployee("xyz", "1", "test",10000);
        System.out.println(emp1.getName()+" "+emp1.getSalary());
        System.out.println(emp2.getName()+" "+emp2.getSalary());
    }
}
class Employee {
    private String name;
    private String id;
    private String role;
    private int salary;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return this.id;
    }
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return this.salary;
    }
    Employee(String name){
        this.name = name;
    }

    Employee(String name, String id, String role){
        this.name = name;
        this.id = id;
        this.role = role;
    }
    
    Employee(String name, String id, String role,int salary){
        this.name = name;
        this.id = id;
        this.role = role;
        this.salary = salary;
    }
}

class HourlyEmployee extends Employee{
    private  int duration;
    @Override
    public void setSalary(int salary) {
        int sal = salary*duration*30;
        super.setSalary(sal);
    }
    public HourlyEmployee(String name,String id,String role, int duration) {
        super(name, id, role);
        this.duration = duration;
    }
    public HourlyEmployee(String name,String id,String role,int duration,int salaryPerHour) {
        super(name, id, role);
        this.duration =duration;
        setSalary(salaryPerHour);
    }  
}

class SalariedEmployee extends Employee{

     @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }
    public SalariedEmployee(String name,String id,String role) {
        super(name, id, role);
    }
    public SalariedEmployee(String name,String id,String role,int salary) {
        super(name, id, role,salary);
    }  
}