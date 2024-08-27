package DSTopicWise.arrays;

import java.util.Arrays;

public class DecompressedList {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        System.out.println(Arrays.toString(decompressList(arr)));
    }
    static int[] decompressList(int[] arr){
        int ind = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i+=2) {
            len+= arr[i];
        }
        int[] nums =new int[len];
        for (int i = 0; i < arr.length; i+=2) {
            System.out.println(i);

            for(int j = ind; j < ind+arr[i];j++){
                nums[j] = arr[i+1];
            }
            ind+=arr[i];
            System.out.println(ind);
        }
        return nums;
    }
}
