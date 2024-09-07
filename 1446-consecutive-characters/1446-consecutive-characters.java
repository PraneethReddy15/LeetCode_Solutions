class Solution {
    public int maxPower(String s) {
        int count=1,maxCount=0;
        if(s.length()==1) return 1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)==s.charAt(i))
            {
                count++;
                maxCount=Math.max(count,maxCount);
            }
            else{
                count=1;
            }
        }
        return maxCount==0?1:maxCount;
    }
}