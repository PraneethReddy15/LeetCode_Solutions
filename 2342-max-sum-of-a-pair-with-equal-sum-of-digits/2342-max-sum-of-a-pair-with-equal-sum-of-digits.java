class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,ArrayList<Integer>>  m = new HashMap<>();
        for(int i : nums)
        {
            m.putIfAbsent(countdig(i),new ArrayList<>());
            m.get(countdig(i)).add(i);
        }
        // System.out.println(m);
        int max=-1;
        for(Map.Entry<Integer,ArrayList<Integer>> entry : m.entrySet())
        {
            ArrayList<Integer> al1=entry.getValue();
            int s=-1;
            if(al1.size()>1)
            {
                Collections.sort(al1);
                s=al1.get(al1.size()-1)+al1.get(al1.size()-2);
            }
            max=Math.max(max,s);
        }
        return max;
    }
    static int countdig(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}