package assignment_8;
// 3. Write a program to generate the matrix with integers in spiral order.
// Get size N from the user and generate an NxN spiral matrix.

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = generateSpiral(3);

        for(int[] nums : arr){
            System.out.println(Arrays.toString(nums));
        }
    }
    static int[][] generateSpiral(int n){
        int[][] mat = new int[n][n];
        int val = 1;

        int top = 0;
        int left = 0;
        int right = n-1;
        int down = n-1;
        int i = 0;
        while(top <= down && left <= right) {
            for(i = left; i<=right;i++){
                mat[top][i] = val++;
            }
            top++;
            for(i = top;i<=down ;i++){
                mat[i][right] = val++;
            }
            right--;
            for(i = right; i>=left;i--){
                mat[down][i] = val++;
            }
            down--;
            for(i = down;i>=top;i--){
                mat[i][left] = val++;
            }
            left++;
        }
        return mat;
    }
}
