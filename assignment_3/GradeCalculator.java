import java.util.Scanner;

public class GradeCalculator {
    // 2. Create a program that takes a student's score as input and outputs their corresponding grade.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Marks Scored :");
        int marks = s.nextInt();
        System.out.println("Enter Total Marks :");
        int total = s.nextInt();
        double percentage = marks*100/total*1.0;
        if(percentage  >= 90){
            System.out.println("Grade : A+");
        }else if(percentage >= 80){
            System.out.println("Grade : A");
        }
        else if(percentage >= 70){
            System.out.println("Grade : B+");
        }
        else if(percentage >= 60){
            System.out.println("Grade : B");
        }
        else if(percentage >= 50){
            System.out.println("Grade : C+");
        }
        else if(percentage >= 40){
            System.out.println("Grade : C");
        }else {
            System.out.println("Grade : Fail");
        }
    }
}
