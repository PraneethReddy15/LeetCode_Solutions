class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incCount=1,max=1,decCount=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1]){
                incCount++;
                decCount=1;
                // maxi=Math.max(maxi,incCount);
            }
            // else incCount=1;
            else if(nums[i]>nums[i+1]){
                decCount++;
                incCount=1;
                // maxd=Math.max(maxd,decCount);
            }
            else{
                incCount=1;
                decCount=1;
            }
            max=Math.max(max,Math.max(incCount,decCount));
            // System.out.println(decCount);
        }
        return max;
    }
}