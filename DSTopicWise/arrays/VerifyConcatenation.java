package DSTopicWise.arrays;

/**
 * You are given an array of distinct integers arr and an array of integer arrays pieces, where the
 * integers in pieces are distinct. Your goal is to form arr by concatenating the arrays in pieces in any
 * order. However, you are not allowed to reorder the integers in each array pieces[i].
 * Return true if it is possible to form the array arr from pieces. Otherwise, return false.
 * Example 1:
 * Input: arr = [15,88], pieces = [[88],[15]]
 * Output: true
 * Explanation: Concatenate [15] then [88]
 * Example 2:
 * Input: arr = [49,18,16], pieces = [[16,18,49]]
 * Output: false
 * Explanation: Even though the numbers match, we cannot reorder pieces[0].
 * Example 3:
 * Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
 * Output: true
 * Explanation: Concatenate [91] then [4,64] then [78]
 */
public class VerifyConcatenation {
    public static void main(String[] args) {
        int[] nums = {91,4,64,78};
        int[][] arr = {{78}, {4,64},{91}};

        System.out.println(canFormArray(nums, arr));
    }
    static public boolean canFormArray(int[] nums, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int len = arr[i].length;
            int ind = -1;
            for(int k = 0;k<nums.length;k++){
                if(nums[k] == arr[i][0]){
                    ind = k;
                    break;
                }
            }
            if(ind == -1) return false;
            int count = 1;

            if(nums.length - ind < len) return false;
            System.out.println(10);
            for(int k = ind+1;k<ind+arr[i].length;k++){
                if(arr[i][count] == nums[k]){
                    count++;
                }else {
                    break;
                }
            }
            if(count != arr[i].length) return false;
        }
        return true;
    }
}
