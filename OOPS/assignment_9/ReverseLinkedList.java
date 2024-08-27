package OOPS.assignment_9;

import OOPS.assignment_8.CharacterArrayList;

import java.util.LinkedList;
import java.util.List;

/**
 * Write a Java program that creates a `LinkedList` of characters with the values {'A', 'B', 'C', 'D', 'E'}. Write a method to reverse the linked list and print the reversed list.
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        List<Character> list = new LinkedList<>();
        for(int i =0;i<5;i++){
            list.add((char)('A'+i));
        }
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
    static void reverse(List<Character> list){
        int left = 0;
        int right = list.size()-1;

        while (left <= right){
            char temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
    }

}
