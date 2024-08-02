package OOPS.assignment_4.employee;

class SalariedEmployee extends Employee {

    @Override
    public int calculatePay(){
        setSalary(getSalary());
        return getSalary();
    }
    @Override
    public void setSalary(int salary){
        calculatePay();
    }

    public SalariedEmployee(String name, String id, String role) {
        super(name, id, role);
    }

    public SalariedEmployee(String name, String id, String role, int salary) {
        super(name, id, role, salary);
    }


}
