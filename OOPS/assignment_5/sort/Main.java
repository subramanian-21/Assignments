package OOPS.assignment_5.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 20, 4, -10, 15, 7, -5, 30, 11,
                25, 6, -3, 12, 8, -12, 22, 18, 5, -7,
                35, -2, 14, 9, 21, -9, 19, 2, -6, 27,
                13, -8, 17, 1, -4, 24, 16, -1, 23, 10,
                0, 26, 29, -11, 28, -14, 31, 3, -13, 33,
                20, 4, -10, 15, 7, -5, 30, 11, 25, 6,
                -3, 12, 8, -12, 22, 18, 5, -7, 35, -2,
                14, 9, 21, -9, 19, 2, -6, 27, 13, -8,
                17, 1, -4, 24, 16, -1, 23, 10, 0, 26,
                29, -11, 28, -14, 31, 3, -13, 33, 20, 4};
       SortAlgo sort = new SortAlgo();

        double initialTimer = System.nanoTime();
        sort.bubbleSort(arr);
        double finalTimer = System.nanoTime();
        System.out.println(Arrays.toString(arr));
        System.out.println("bubble sort -> "+(finalTimer - initialTimer));
        int[] arr3 = { 10, 3, 20, 4, -10, 15, 7, -5, 30, 11,
                25, 6, -3, 12, 8, -12, 22, 18, 5, -7,
                35, -2, 14, 9, 21, -9, 19, 2, -6, 27,
                13, -8, 17, 1, -4, 24, 16, -1, 23, 10,
                0, 26, 29, -11, 28, -14, 31, 3, -13, 33,
                20, 4, -10, 15, 7, -5, 30, 11, 25, 6,
                -3, 12, 8, -12, 22, 18, 5, -7, 35, -2,
                14, 9, 21, -9, 19, 2, -6, 27, 13, -8,
                17, 1, -4, 24, 16, -1, 23, 10, 0, 26,
                29, -11, 28, -14, 31, 3, -13, 33, 20, 4};


    Arrays.sort(arr3);
    reverse(arr3);
        initialTimer = System.nanoTime();
        sort.quickSort(arr3);
       finalTimer = System.nanoTime();
        System.out.println(Arrays.toString(arr3));
        System.out.println("quicksort -> "+(finalTimer - initialTimer));


        int[] arr2 = { 10, 3, 20, 4, -10, 15, 7, -5, 30, 11,
                25, 6, -3, 12, 8, -12, 22, 18, 5, -7,
                35, -2, 14, 9, 21, -9, 19, 2, -6, 27,
                13, -8, 17, 1, -4, 24, 16, -1, 23, 10,
                0, 26, 29, -11, 28, -14, 31, 3, -13, 33,
                20, 4, -10, 15, 7, -5, 30, 11, 25, 6,
                -3, 12, 8, -12, 22, 18, 5, -7, 35, -2,
                14, 9, 21, -9, 19, 2, -6, 27, 13, -8,
                17, 1, -4, 24, 16, -1, 23, 10, 0, 26,
                29, -11, 28, -14, 31, 3, -13, 33, 20, 4};



        initialTimer = System.nanoTime();
        sort.mergeSort(arr2);
        finalTimer = System.nanoTime();
        System.out.println(Arrays.toString(arr2));
        System.out.println("mergesort -> "+(finalTimer - initialTimer));

    }

    static  void reverse(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while (s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;e--;
        }
    }
}
