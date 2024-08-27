package OOPS.assignment_8;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Write a Java program that creates an `ArrayList` of characters.
 * Add ten different characters to the list. Write a method that takes
 * a character as an argument and returns the index of the character in the list.
 * If the character is not found, return -1.
 */
public class CharacterArrayList {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        List<Character> list = createArrayList(arr);
        System.out.println(indexOf(list,'b'));
        System.out.println(indexOf(list,'f'));
        System.out.println(indexOf(list,'t'));
        System.out.println(indexOf(list,'e'));
        System.out.println(indexOf(list,'a'));
        System.out.println(indexOf(list,'o'));
    }
    static int indexOf(List<Character> list, char ele){
        for(int i = 0;i<list.size();i++){
            if(list.get(i) == ele){
                return i;
            }
        }
        return -1;
    }
    static List<Character> createArrayList(char[] arr){
        List<Character> list = new ArrayList<>();
        for(char i : arr){
            list.add(i);
        }
        return list;
    }
}
