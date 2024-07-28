package OOPS.assignment_3.libraryManagement.user;

import java.util.Scanner;

public class Student extends User{
    private String grade;
    private String section;

    public Student(String name, String userId,String password, String grade, String section){
        super(name,userId,password);
        this.grade = grade;

        this.section = section;
    }


}
