package OOPS.assignment_4.employee;

class HourlyEmployee extends Employee {
    private int duration;

    public HourlyEmployee(String name, String id, String role, int duration) {
        super(name, id, role);
        this.duration = duration;
    }

    public HourlyEmployee(String name, String id, String role, int duration, int salaryPerHour) {
        super(name, id, role,salaryPerHour);
        this.duration = duration;
        ;
    }
    @Override
    public void setSalary(int salary){
        calculatePay();
    }
    @Override
    public int calculatePay(){
        int sal = getSalary() * duration * 30;
        super.setSalary(sal);
        return sal;
    }
}
