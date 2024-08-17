package OOPS.assignment_6.university.faculty;

class ScienceFaculty extends Faculty {

    public ScienceFaculty(String facultyId, String name, String department) {
        super(facultyId, name, department);
    }

    @Override
    public void displayDepartment() {
        System.out.println(name + " belongs to the Science department.");
    }
}
