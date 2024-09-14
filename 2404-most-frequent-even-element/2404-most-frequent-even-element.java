class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i : nums){
           if(i%2==0) m.put(i,m.getOrDefault(i,0)+1);
        }
        // System.out.println(m);
        int max=-1, key=-1;
        for(Map.Entry<Integer,Integer> entry:m.entrySet())
        {
            if(entry.getValue()>max)
            {
                key=entry.getKey();
                max=entry.getValue();
            }
            else if(entry.getValue()==max)
            {
                key=Math.min(key,entry.getKey());
            }
        }
        return key;
    }
}