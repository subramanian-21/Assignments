package OOPS.assignment_10;

import java.util.Vector;

/**
 *
 1. Write a Java program that creates a `Vector` of integers. Add the numbers 10, 20, 30, 40, and 50 to the vector. Retrieve and print the element at the second index (third element) in the vector. Then, print all elements in the vector.
 */
public class InitializeVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for(int i = 10;i<=50;i+=10){
            vector.add(i);
        }
        System.out.println(vector.get(2));
        System.out.println(vector);
    }
}
