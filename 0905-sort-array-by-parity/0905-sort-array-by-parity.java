class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[]=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0){
                res[index++]=nums[i];
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]%2!=0) res[index++]=nums[j];
        }
        return res;
    }
}