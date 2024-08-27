package DSTopicWise.arrays;

import java.util.Arrays;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extra = 3;
        System.out.println(Arrays.toString(greatestCandies(candies, extra)));

    }
    static boolean[] greatestCandies(int[] kids, int candies) {
        boolean[] arr =new boolean[kids.length];
        int max = max(kids);
        for (int i = 0;i< kids.length;i++){
            if(kids[i] + candies >= max){
                arr[i] = true;
            }
        }
        return arr;
    }
    static int max(int[] arr){
        if (arr.length == 0) return -1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
