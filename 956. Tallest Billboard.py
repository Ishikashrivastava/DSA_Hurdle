class Solution:
    def tallestBillboard(self, rods: List[int]) -> int:
        @lru_cache(None)
        def dp(i,diff):
            if i>=len(rods):
                return 0 if diff==0 else float('-inf')
            return max(dp(i+1,diff),rods[i]+dp(i+1,diff+rods[i]),dp(i+1,diff-rods[i]))
        return dp(0,0)