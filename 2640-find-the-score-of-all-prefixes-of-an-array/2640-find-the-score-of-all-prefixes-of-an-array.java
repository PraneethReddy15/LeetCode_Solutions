class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] ans=new long[nums.length];
        long[] res=new long[nums.length];
        long max=-1;
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            max = Math.max(max, nums[i]);
            ans[i]=nums[i]+max;
            sum+=ans[i];
            res[i]=sum;
        }
        
        return res;
    }
}