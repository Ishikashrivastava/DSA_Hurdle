
class Solution
{
    public int minNumber(int arr[], int N)
    {
        int sum = 0;
        int ans = 0; 
        for(int n : arr){
            sum+=n;
            
        }
        while(!isprime(sum)){
            sum++;
            ans++;
        }
        return ans;
        

    }
    
    public boolean isprime(int n){
    for(int i =2;i*i<=n;i++){
        if(n%i==0){
            return false;
        }
    }
    
    return true;

    }
}