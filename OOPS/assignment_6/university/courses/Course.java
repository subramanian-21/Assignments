package OOPS.assignment_6.university.courses;

public abstract class Course {
    protected String courseId;
    protected String courseName;
    protected int credits;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public abstract void displayCourseType();

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                '}';
    }
}

