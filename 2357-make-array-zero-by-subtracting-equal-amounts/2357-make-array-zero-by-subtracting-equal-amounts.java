class Solution {
    public int minimumOperations(int[] nums) {
        int freq[] = new int[101];
        int count = 0;
        for(int i = 0;i < nums.length; ++i) {
            if(nums[i]!=0){
                freq[nums[i]]++;
            }
        }
        for(int i = 0;i < 101; ++i) {
            if(freq[i]>0) count++;
        }
        return count;
    }
}