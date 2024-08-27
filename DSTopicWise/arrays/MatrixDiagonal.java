package DSTopicWise.arrays;

/**
 * 1.Given a square matrix mat, return the sum of the matrix diagonals. Only include the sum of all
 * the elements on the primary diagonal and all the elements on the secondary diagonal that are not
 * part of the primary diagonal.
 *
 * Example 1
 * Input: mat = [[1,2,3],
 *              [4,5,6],
 *              [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 */
public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1,}, {1,1,1,1,}, {1,1,1,1}, {1,1,1,1}};

        System.out.println(diagonalSum(arr));
    }
    static int diagonalSum(int[][] matrix){
        int sum = 0;
        int left = 0;
        int right = matrix[0].length-1;
        for(int i = 0;i<matrix.length;i++){
            if(left == right){
                sum += matrix[i][left];
            }else {
                sum += matrix[i][left] +matrix[i][right];
            }
            left++;
            right--;
        }
        return sum;
    }
}
