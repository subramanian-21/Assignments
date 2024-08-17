package OOPS.assignment_6.university.students;

class ScienceStudent extends Student {

    public ScienceStudent(String studentId, String name, int age, String department) {
        super(studentId, name, age, department);
    }

    @Override
    public void displaySpecialization() {
        System.out.println(name + " specializes in Science.");
    }
}
