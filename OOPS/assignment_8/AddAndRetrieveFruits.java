package OOPS.assignment_8;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Write a Java program that creates an `ArrayList` of strings. Add five different fruits to the list, then retrieve and print the third fruit in the list.
 */
public class AddAndRetrieveFruits {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Jack Fruit");
        list.add("Orange");
        list.add("Grapes");
        System.out.println(list.get(3-1));
    }
}
