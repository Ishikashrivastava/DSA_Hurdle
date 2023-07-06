class Solution {
public:
    int minSubArrayLen(int tar, vector<int>& nums) {
        int summ=accumulate(nums.begin(),nums.end(),0);
        if(summ<tar){
            return 0;
        }
        int l=0,r=0;
        int sum=0;
        int mini=INT_MAX;
        int n=nums.size();
        while(r<n){
            if(sum<tar){
                sum+=nums[r];
                r++;
            }
            else{
                mini=min(mini,(int)(r-l));
                sum-=nums[l];
                l++;
            }
        }
        while(sum-nums[l]>=tar){
            sum-=nums[l];
            l++;
        }
        mini=min(mini,r-l);
        return mini;
    }
};