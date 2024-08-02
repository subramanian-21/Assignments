package OOPS.assignment_4.employee;

public  abstract  class Employee {
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
    public String getEmployeeDetails(){
        return "{\n" +
                "name :"+name+"\n"+
                "id :" +id+"\n"+
                "role :" +role+"\n"+
                "salary :" +salary+"\n"+
                "}";
    }
    public abstract  int calculatePay();
}

