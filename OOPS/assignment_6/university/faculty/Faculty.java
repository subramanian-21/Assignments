package OOPS.assignment_6.university.faculty;

public abstract class Faculty {
    protected String facultyId;
    protected String name;
    protected String department;

    public Faculty(String facultyId, String name, String department) {
        this.facultyId = facultyId;
        this.name = name;
        this.department = department;
    }

    public abstract void displayDepartment();

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyId='" + facultyId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

