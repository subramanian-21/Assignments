import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Two nos :");
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("Or operation :"+ (a | b));
        System.out.println("and operation :"+ (a & b));
        System.out.println("Xor operation :"+ (a^b));
        System.out.println("left shift :"+(a << b));
        System.out.println("right shift :"+ (a >> b));
        System.out.println("unsigned right shift :"+(a >>> b));
    }
}
