package DSTopicWise.strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String[] arr = {"h","e","l","l","o"};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(String[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            swap(arr, i, j);
            i++;j--;
        }
    }
    static void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
