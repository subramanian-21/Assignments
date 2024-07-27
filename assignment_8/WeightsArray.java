package assignment_8;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * 4. Initialize a jagged array with N rows with weights of N persons.
 Each person can have different number of weights. 
 Write 
      a. A function to enter the weight of any user at any time. 
      b. A function to calculate the minimum weight of the nth person.
 */
public class WeightsArray {
    private List<List<Integer>> personsWeights = new ArrayList<>();
    public static void main(String[] args) {
        WeightsArray wr = new WeightsArray();
        wr.addNewPersonWeight(100,200,10,203,10);
        wr.addNewPersonWeight(30,20,301,102,302,22,203,201);
        wr.addPersonWeight(0, 10000);

        wr.showAllRecords();
        System.out.println(wr.minWeight(1));
    }
    void addNewPersonWeight(int... weights){
        List<Integer> person = new ArrayList<>();
        for(int weight : weights){
            person.add(weight);
        }
        personsWeights.add(person);
    }
    void addPersonWeight(int personId, int... weights){
        List<Integer> person = personsWeights.get(personId);
        for(int weight : weights){
            person.add(weight);
        }
    }
    int minWeight(int personId){
        List<Integer> person = personsWeights.get(personId);;
        int minWeight = Integer.MAX_VALUE;

        for(int i = 0;i<person.size();i++){
            minWeight = Math.min(minWeight, person.get(i));
        }
        return minWeight;
    }
    void showAllRecords(){
        for(int i = 0;i<personsWeights.size();i++){
            System.out.println(personsWeights.get(i));
        }
    }
}
