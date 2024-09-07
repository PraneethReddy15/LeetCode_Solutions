class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int sum=0,Listsum=0;
        for(int i : nums) sum+=i;
        for(int i=nums.length-1;i>=0;i--)
        {
            ans.add(nums[i]);
            Listsum+=nums[i];
            sum-=nums[i];
            if(Listsum>sum) break;
        }
        return ans;
    }
    
}