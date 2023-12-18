class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int num : arr){
            if(num<0){
                neg.add(num);
            }else{
                pos.add(num);
            }
        }
        
        
        int i =0, j =0, k=0;
        
        while (k < arr.length) {
            if (i < pos.size()) {
                arr[k++] = pos.get(i++);
            }

            if (j < neg.size()) {
                arr[k++] = neg.get(j++);
            }
        }
        
    }
}

