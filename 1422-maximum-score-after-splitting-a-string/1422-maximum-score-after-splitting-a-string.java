class Solution {
    public int maxScore(String s) {
        int max=0,Omax=-1,ones=0,zeros=0,l=0,r=0;
        for(int i=0;i<s.length();i++)
        {
            ones=0;
            zeros=0;
            if(i!=s.length()-1) l=i;
            for(int x=0;x<=l;x++)
            {
                if(s.charAt(x)=='0') zeros++;
            }
            for(int j=l+1;j<s.length();j++)
            {
                if(s.charAt(j)=='1') ones++;
            }
            max=ones+zeros;
            Omax=Math.max(max,Omax);
        }
        return Omax;

    }
}