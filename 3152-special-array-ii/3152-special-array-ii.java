class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) 
    {
        int n=queries.length;
        boolean res[]=new boolean[n];
        int k=0;
        
        for(int[] j:queries){
            boolean flag=true;
        for(int i=j[0];i<j[1];i++)
        {
            if(Math.abs(nums[i]%2-nums[i+1]%2)!=1)
            {
                flag=false;
                break;
            }
        }
            res[k]=flag;
            k++;
        }
        return res;
    }
}