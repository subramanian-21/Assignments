package OOPS.assignment_9;

import java.util.LinkedList;

/**
 * 1.Write a Java program that creates a `LinkedList` of integers. Add the numbers 5, 10, 15, 20, and 25 to the list. Retrieve and print the first and last elements in the list.
 */
public class PrintFirstAndLastInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);

    }
}
