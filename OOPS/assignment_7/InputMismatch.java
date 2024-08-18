package OOPS.assignment_7;

import OOPS.assignment_7.CustomException.InvalidInputException;
import OOPS.assignment_7.CustomException.InvalidPhoneNumberException;

import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter phone number : ");
            long phone = validateInput(scanner);
            System.out.println("Your phone number is : "+phone );
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static long validateInput(Scanner scanner) throws InvalidInputException, InvalidPhoneNumberException{
        try {
            long phone = scanner.nextLong();
            if(getSize(phone) != 10){
                throw new InvalidPhoneNumberException();
            }
            return phone;
        }
        catch (InvalidPhoneNumberException e){
            throw new InvalidPhoneNumberException();
        }
        catch (Exception e){
            throw new InvalidInputException();
        }
    }
    static int getSize(long number) {
        return (int)Math.log10(number)+1;
    }
}
