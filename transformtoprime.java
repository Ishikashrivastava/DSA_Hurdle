
class Solution
{
    public int minNumber(int arr[], int N)
    {
        int sum = 0;
        for(int i=0;i<N;i++){
            sum += arr[i];
        }
        if(sum==1){
            return 1;
        }
        boolean flag = isPrime(sum);
        int min = 0;
        if(flag==true){
            return 0;
        }else{
           for(int j = 1; j<=Integer.MAX_VALUE/2;j++){
               if(isPrime(sum+j)){
                   return j;
               }
           } 
        }
        
        return 0;
        
    }  
    public boolean isPrime(int num){
        boolean flag = true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag = false;
                break;
            }else{
                flag = true;
            }
        }
        return flag;
    }
    
            
}