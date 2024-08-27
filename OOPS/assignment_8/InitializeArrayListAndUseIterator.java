package OOPS.assignment_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 2. Create a Java program that initializes an `ArrayList` of integers with the values {10, 20, 30, 40, 50}. Use an iterator to iterate through the list and remove all elements greater than 30. Print the modified list.
 */
public class InitializeArrayListAndUseIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr= {10, 20, 30, 40, 50};

        for(int i : arr){
            list.add(i);
        }
        System.out.println(list);

        Iterator<Integer> listIt = list.iterator();

        while (listIt.hasNext()){
            if(listIt.next() > 30){
                listIt.remove();
            }
        }

        System.out.println(list);
    }
}
