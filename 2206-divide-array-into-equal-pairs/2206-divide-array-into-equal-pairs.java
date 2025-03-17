class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i=i+2)
        {
            int a=nums[i-1];
            int b=nums[i];
            if(a!=b) return false;
        }
        return true;
    }
}