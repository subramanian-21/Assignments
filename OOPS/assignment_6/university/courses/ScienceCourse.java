package OOPS.assignment_6.university.courses;

public class ScienceCourse extends Course {

    public ScienceCourse(String courseId, String courseName, int credits) {
        super(courseId, courseName, credits);
    }

    @Override
    public void displayCourseType() {
        System.out.println(courseName + " is a Science course.");
    }
}
