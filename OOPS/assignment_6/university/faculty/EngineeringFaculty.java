package OOPS.assignment_6.university.faculty;

class EngineeringFaculty extends Faculty {

    public EngineeringFaculty(String facultyId, String name, String department) {
        super(facultyId, name, department);
    }

    @Override
    public void displayDepartment() {
        System.out.println(name + " belongs to the Engineering department.");
    }
}
