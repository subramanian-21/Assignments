package OOPS.assignment_10;

import OOPS.assignment_8.ArrayToArrayListViceVersa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
/**
 * 3. Write a Java program that initializes a `Vector` of strings with the values {"red", "green", "blue", "yellow"}. Convert the vector to an array, print the array, then convert the array back to a vector and print the resulting vector.
 */
public class VectorToArrayViceVersa {
    public static void main(String[] args) {
        String[] arr =  {"red", "green", "blue", "yellow"};

        Vector<String> vector = new Vector<>(Arrays.asList(arr));

        System.out.println("vector : "+vector);
        arr = vector.toArray(new String[0]);
        System.out.println("arr : "+ Arrays.toString(arr));
    }
}
