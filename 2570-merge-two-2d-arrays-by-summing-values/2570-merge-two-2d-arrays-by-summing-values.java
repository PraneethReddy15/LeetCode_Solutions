class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=1;j<nums1[i].length;j++)
            {
                if(map.containsKey(nums1[i][j-1]))
                {
                    map.put(nums1[i][j-1],map.get(nums1[i][j-1])+nums1[i][j]);
                }
                else{
                    map.put(nums1[i][j-1],nums1[i][j]);
                }
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=1;j<nums2[i].length;j++)
            {
                if(map.containsKey(nums2[i][j-1]))
                {
                    map.put(nums2[i][j-1],map.get(nums2[i][j-1])+nums2[i][j]);
                }
                else{
                    map.put(nums2[i][j-1],nums2[i][j]);
                }
            }
        }
        int ans[][]=new int[map.size()][2];
        int i=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            ans[i][0]=entry.getKey();
            ans[i][1]=entry.getValue();
            i++;
        }
        return ans;
    }
}