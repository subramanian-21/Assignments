package OOPS.assignment_6.university;

import OOPS.assignment_6.university.courses.Course;
import OOPS.assignment_6.university.courses.EngineeringCourse;
import OOPS.assignment_6.university.students.Student;

public class Main {
    public static void main(String[] args) {
        Course java = new EngineeringCourse("1", "java", 10);
        Course c = new EngineeringCourse("2", "c", 10);
        Course cpp = new EngineeringCourse("3", "cpp", 10);
        Course js = new EngineeringCourse("4", "js", 10);

    }
}
