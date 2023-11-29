public class Sort an array of 0s, 1s and 2s {
    class Solution
{
    public static void sort012(int a[], int n)
    {
        int arr[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            arr[a[i]]++;
        }
        
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            while(arr[i]>0)
            {
                a[j]=i;
                j++;
                arr[i]--;
                
            }
        }
    }
}

    
    
}
