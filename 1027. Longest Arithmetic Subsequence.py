1027. Longest Arithmetic Subsequence
class Solution:
    def longestArithSeqLength(self, nums: List[int]) -> int:
        seqs = {}
        seen = set()
        for num in nums:
            
            for s in seen:
                step = num-s
                if (step,s) in seqs:
                    longest = seqs[step,s] + 1
                else:
                    longest = 2
                if (step,num) in seqs:
                    seqs[step,num] = max(seqs[step,num],longest)
                else:
                    seqs[step,num] = longest
            if num not in seen:
                seqs[0,num] = 1
            seen.add(num)

        return max([seqs[k] for k in seqs]) 