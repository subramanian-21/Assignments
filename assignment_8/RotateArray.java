import java.util.Arrays;
import java.util.Scanner;
public class RotateArray {
    /**
     * 1. Create a program that rotates the elements of an array to the right 
     * by a specified number of positions. Get the array and the rotation count from the user
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size");
        int len = scanner.nextInt();
        int[] arr =new int[len];
        System.out.print("Enter "+len+" array elements :");
        for(int i = 0;i<len;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter rotation count :");
        int count = scanner.nextInt();
        rotateArray(arr, count);
        System.out.println(Arrays.toString(arr));
    }
    // input - {1,2,3,4,5} count = 3; {5,4,3,2,1} => {4,5,3,2,1} => {4,5,1,2,3};
    // output = {4,5,1,2,3};
    static void rotateArray(int[] arr, int count){
        int len = arr.length;
        count = count%len;
        reverse(arr, 0, len-1);
        reverse(arr, len-count, len-1);
        reverse(arr, 0, len-count-1);
    }
    static  void reverse(int[] arr, int i , int j){
        while (i < j) {
            swap(arr, i, j);
            i++;j--;
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
