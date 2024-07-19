public class AverageWeights {
    public static void main(String[] args) {
        int[] weights = {40,50,32,45,67,21,78,80,92,12,57};
        double averageWeights = average(weights);
        System.out.printf("%.2f",averageWeights);
    }
    static double average(int[] weights){
        double totalWeights = 0;

        for(int weight : weights){
            totalWeights+=weight;
        }
        double totalPeople = weights.length;

        return totalWeights/totalPeople;
    }
}
