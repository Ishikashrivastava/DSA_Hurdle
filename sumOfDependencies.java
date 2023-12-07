import java.util.ArrayList;

public class sumOfDependencies {
    class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int v) {
        int sum=0;
        for(int i=0;i<v;i++){
            sum+=adj.get(i).size();
        }
        return sum;
        // code here
    }
};

