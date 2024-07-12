package assignment_2;
import java.util.Scanner;
// 2. Write a program to solve a quadratic equation (ax^2+bx+c). Take a,b and c from user and use quadratic formula.
public class SolveQuadratic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter coefficients :");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        // -b +|- sqrt(b^2 - 4ac) / 2a

        int determinant = b*b - 4*a*c;

        if(determinant > 0){
            double sqrt = Math.sqrt(determinant);
            double positive = (-b + sqrt)/(2*a*1.0);
            double negative = (-b - sqrt)/(2*a*1.0);
            System.out.println("roots are :"+ positive+" "+ negative);
        }else if(determinant == 0){
            double root = -b/(2*a*1.0);
            System.out.println("roots :"+root);
        }else{
            System.out.println("no real roots");
            double root = -b/2.0*a;
            double det = Math.sqrt(-determinant)/2.0*a;
            System.out.println("roots :");
            System.out.println(root+"+"+det+"i");
            System.out.println(root+"-"+det+"i");
        }


    }
} 
 