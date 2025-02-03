class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incCount=1,maxi=1,decCount=1,maxd=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1]){
                incCount++;
                maxi=Math.max(maxi,incCount);
            }
            else incCount=1;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1]){
                decCount++;
                maxd=Math.max(maxd,decCount);
            }
            else decCount=1;
            // System.out.println(decCount);
        }
        return Math.max(maxi,maxd);
    }
}