package OOPS.assignment_8;

import java.util.Arrays;
import java.util.List;

/**
 * 4. Write a Java program that initializes an `ArrayList` of strings with the values {"apple", "banana", "cherry"}. Convert the `ArrayList` to an array, print the array, then convert the array back to an `ArrayList` and print the `ArrayList`.
 */
public class ArrayToArrayListViceVersa {
    public static void main(String[] args) {
        String[] arr =  {"apple", "banana", "cherry"};
        List<String> list = Arrays.asList(arr);
        arr = (String[]) list.toArray();
    }
}
