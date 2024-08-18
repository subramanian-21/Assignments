package OOPS.assignment_7.CustomException;

import java.util.Scanner;

public class ZeroException {
    public static void main(String[] args) throws CustomArithmeticException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter divisior :");
            int divisor = validateInput(scanner);
            System.out.print("Enter divident :");
            int divident = validateInput(scanner);
            if(divisor == 0){
                throw new CustomArithmeticException();
            }
            System.out.println("Ans : "+divident/divisor);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            scanner.close();
        }
    }
    static int validateInput(Scanner scanner) throws InvalidInputException {
        try {
            return scanner.nextInt();
        }catch (Exception e){
            throw new InvalidInputException();
        }
    }

}
