class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        int ne=0;
        int pe=0;
        for(int i=0;i<nums.length;i++)
        {
            int t=target-nums[i];
            if(!map.containsKey(t))
            {
                map.put(nums[i],i);
            }
            else{
                ne=i;
                pe=map.get(t);
                break;
            }
        }
        // System.out.println(map);
        return new int[]{pe,ne};
    }        
}
