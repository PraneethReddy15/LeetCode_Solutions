class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n= nums.length;
        int res[]=new int[n-k+1];
        for (int i=0;i<=n-k;i++) 
        {
            int max=nums[i];
            boolean flag = true;
            for (int j=i;j<i+k-1;j++) 
            {
                if(Math.abs(nums[j]-nums[j+1])==1 && (nums[j]<nums[j+1]) )
                {
                    max = Math.max(max, nums[j+1]);
                } 
                else {
                    flag = false;
                    break;
                }
            }
            res[i] = flag?max:-1;
        }
        return res;
    }
}