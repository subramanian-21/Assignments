package OOPS.assignment_2.office;

// 2. Create an Employee DTO class. Create appropriate instance variables,
// static variables and methods with appropriate access modifiers.
// Maintain encapsulation by giving controlled access to employee's PII.

public class Employee {
    private final String employeeId;
    private final String employeeName;
    private String department;
    private int ctc;
    private static int count = 0;
    Employee(String employeeName, String department, int ctc){
        this.employeeName = employeeName;
        this.department =department;
        this.ctc = ctc;
        this.employeeId = generateEmployeeId();
        count++;
    }
    private String generateEmployeeId(){
        return employeeName+"-"+count+"@"+department;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public int getCtc() {
        return ctc;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCtc(int ctc) {
        this.ctc = ctc;
    }

    @Override
    public String toString() {
        return "id : "+employeeId+"\nname : "+employeeName+"\ndepartment : "+department+"\nctc : "+ctc+"\n";
    }
}
