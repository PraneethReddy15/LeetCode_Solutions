class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max1=0,max2=0;
        if(nums[0]<0 && nums[1]<0) {
            max1=nums[0]*nums[1]*nums[nums.length-1];
        }
        max2= nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        return Math.max(max1,max2);
    }
}