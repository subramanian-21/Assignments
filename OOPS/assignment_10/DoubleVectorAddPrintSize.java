package OOPS.assignment_10;

import java.util.Vector;

/**
 * 2. Write a Java program that creates a `Vector` of doubles. Add five random double values to the vector. Check if the value 10.5 is in the vector. Print the size of the vector before and after adding an additional value.
 */
public class DoubleVectorAddPrintSize {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<>();

        for (int i = 0; i < 50; i++) {
            vector.add(i/7.0);
            System.out.println(vector.capacity());
        }

        System.out.println(vector);
    }
}
