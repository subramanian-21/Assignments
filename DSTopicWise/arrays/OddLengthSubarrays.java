package DSTopicWise.arrays;

public class OddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(oddLengthSubArray(arr));
    }
    static int oddLengthSubArray(int[] arr){
        int len = arr.length;
        int num = 1;
        int total = 0;
        for (int i = 0; i < len; i++) {
            total += (((i+1)*(len-i)+1)/2 )* arr[i];
        }
        return total;
    }
}
