class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) 
    {
        int arr[]=new int[nums.length];
        int z=0;
        for(int i:nums){
            arr[z++]=i;
        }
        while(k-->0)
        {
            int m=min(arr);
            arr[m]=(arr[m]*multiplier);
            // System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    static int min(int arr[])
    {
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min) {
                min=arr[i];
                index=i;
            }
        }
        // System.out.println("min:"+min);
        return index;
    }
}