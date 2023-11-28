public class Maximum of all subarrays of size k {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {  
          ArrayList<Integer> list = new ArrayList<>();
        
        for(int x=0; x<=n-k; x++){
            int max = -1;
            for(int y=x; y<x+k; y++){
                max = Math.max(arr[y], max);
            }
            list.add(max);
            max = -1;
        }
        return list;
    }

}
