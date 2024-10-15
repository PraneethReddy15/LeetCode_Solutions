class Solution {
    public long minimumSteps(String s) {
        long count=0;
        int ZCount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                count+=ZCount;
            }
            else{
                ZCount++;
            }
        }
        return count;
    }
}