class Solution {
    public int maxPower(String s) {
        int count=1,maxCount=0;
        if(s.length()==1) return 1;
        for(int i=1;i<s.length();i++)
        {
            char a=s.charAt(i-1);
            char b=s.charAt(i);
            System.out.println(a +" "+ b);
            if(a==b)
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