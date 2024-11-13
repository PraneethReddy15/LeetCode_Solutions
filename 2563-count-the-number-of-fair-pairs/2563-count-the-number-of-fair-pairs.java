class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]<=upper && lower<=nums[i]+nums[j]) count++;
            }
        }
        return count;

    }
}