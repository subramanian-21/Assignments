package OOPS.assignment_7;

import java.util.Scanner;

public class ZeroException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter divisior :");
            int divisor = scanner.nextInt();
            System.out.print("Enter divident :");
            int divident = scanner.nextInt();

            System.out.println("Ans : "+divident/divisor);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            scanner.close();
        }
    }
}
