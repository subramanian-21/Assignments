package OOPS.assignment_9;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 2. Create a Java program that initializes a `LinkedList` of strings with the values {"one", "two", "three", "four", "five"}. Use a `ListIterator` to iterate through the list and replace every occurrence of the word "three" with "THREE". Print the modified list.
 */
public class ModifyWithListIterator {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");

        list.add("three");
        list.add("four");

        list.add("five");

        list.add("three");
        list.add("two");

        ListIterator<String> li = list.listIterator();

        while (li.hasNext()){
            if(li.next().equals("three")){
                li.set("THREE");
            }
        }
        System.out.println(list);
    }
}
