package OOPS.assignment_6.university.courses;

public class EngineeringCourse extends Course {

    public EngineeringCourse(String courseId, String courseName, int credits) {
        super(courseId, courseName, credits);
    }

    @Override
    public void displayCourseType() {
        System.out.println(courseName + " is an Engineering course.");
    }
}
