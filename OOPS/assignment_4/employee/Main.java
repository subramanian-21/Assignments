package OOPS.assignment_4.employee;

/**
 *
 */
class Main {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee("abc", "1", "sd", 10, 1000);
        Employee emp2 = new SalariedEmployee("xyz", "1", "test", 10000);
        emp1.calculatePay();
        System.out.println(emp1.getEmployeeDetails());
        System.out.println(emp2.getEmployeeDetails());
    }
}
