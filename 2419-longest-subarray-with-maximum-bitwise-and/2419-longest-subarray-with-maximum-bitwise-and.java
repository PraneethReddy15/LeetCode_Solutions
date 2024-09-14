class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal=Integer.MIN_VALUE;
        for(int num : nums) {
            maxVal=Math.max(maxVal, num);
        }
        int longest = 0, currentLength=0;
        for (int num : nums) {
            if (num==maxVal) 
            {
                currentLength++;
                longest=Math.max(longest,currentLength);
            } 
            else 
            {
                currentLength = 0;
            }
        }
        
        return longest;
    }
}
