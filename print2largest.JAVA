
class Solution {
    int print2largest(int arr[], int n) {
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int slargest=-1;
        for(int j=0;j<n;j++){
            if(arr[j]>slargest && arr[j]!=largest){
                slargest=arr[j];
            }
        }
        return slargest;
        
    }
}
