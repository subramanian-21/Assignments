package OOPS.assignment_2.office;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Office {
    private String name;
    private String location;
    private String domain;
    private List<Employee> employees;

    Office(String name, String location, String domain,Employee... employees){
        this.name = name;
        this.location = location;
        this.domain = domain;
        this.employees = new ArrayList<>();
        this.employees.addAll(Arrays.asList(employees));
    }
    Office(String name, String location, String domain){
        this.name = name;
        this.location = location;
        this.domain = domain;
        this.employees = new ArrayList<>();
    }
    private void addEmployee(Employee... employees){
        this.employees.addAll(Arrays.asList(employees));
    }
    private String getEmployees() {
        String out = "";
        for (Employee employee : employees) {
            out += employee.toString() + "\n";
        }
        return out;
    }

    public String getName() {
        return name;
    }

    public String getDomain() {
        return domain;
    }

    public String getLocation() {
        return location;
    }

    public static void main(String[] args) {
        Employee subramanian = new Employee("Subramanian","full stack",800000);
        Employee mani = new Employee("mani","frontend",700000);
        Office zoho = new Office("zoho","chennai","software",subramanian,mani);

        System.out.println(zoho.getEmployees());
    }
}
