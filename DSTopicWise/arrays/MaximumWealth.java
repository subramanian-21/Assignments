package DSTopicWise.arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] wealth = {{1,2,3}, {3,2,1}};
    }
    static int maxWealth(int[][] wealth){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < wealth.length; i++) {
            int sum = 0;
            for (int j = 0; j < wealth[i].length; j++) {
                sum += wealth[i][j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
