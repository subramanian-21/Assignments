package OOPS.assignment_7;

import OOPS.assignment_7.CustomException.CustomArrayIndexException;
import OOPS.assignment_7.CustomException.InvalidInputException;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size :");
        int[] arr = new int[5];
        try {
           int n = validateInput(scanner);
           arr = new int[n];
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scanner.next();
        while (true){
            System.out.println();
            System.out.print("Enter index and element to be added :");

            try {
                int i = validateIndex(scanner, arr.length);
                int ele = validateInput(scanner);
                arr[i] = ele;
                System.out.println(Arrays.toString(arr));
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
    static int validateInput(Scanner scanner) throws InvalidInputException{
        try {
            int n = scanner.nextInt();
            return n;
        }
        catch (Exception e){
            System.out.println("Entering Default value 5");
            throw new InvalidInputException();
        }
    }
    static int validateIndex(Scanner scanner, int len) throws CustomArrayIndexException{
            int n = scanner.nextInt();

            if(n < 0 || n >= len){
                throw new CustomArrayIndexException(n);
            }
            return n;
    }
}
