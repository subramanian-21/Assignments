package OOPS.assignment_9;

import java.util.LinkedList;
import java.util.List;

/**
 3. Write a Java program that creates a `LinkedList` of integers. Add the numbers 1 to 10 to the list. Then, remove the third element (index 2) and the last element from the list. Print the resulting list. */
public class AddAndRemoveInList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for(int i = 1;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);
        list.remove(2);
        list.removeLast();
        System.out.println(list);
    }
}
