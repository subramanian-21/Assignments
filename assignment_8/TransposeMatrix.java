

import java.util.Arrays;

public class TransposeMatrix {
    /**
     * 2. Write a program to find transpose of a matrix
     */
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(mat);
        for(int[] arr : mat){
            System.out.println(Arrays.toString(arr));
        }
    }
    static void transpose(int[][] mat){
        for(int i = 0;i<mat.length;i++){
            for(int j = i+1;j<mat[0].length;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
