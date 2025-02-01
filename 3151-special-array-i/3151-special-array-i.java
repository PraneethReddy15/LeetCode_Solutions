class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1) return true;
        boolean flag=true;;
        int even=0,odd=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(Math.abs(nums[i]%2-nums[i+1]%2)!=1)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
}