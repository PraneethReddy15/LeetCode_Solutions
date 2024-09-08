class Solution {
    public int minPartitions(String n) {
        int max=-1;
        for(int i=0;i<n.length();i++)
        {
            int c=n.charAt(i)-'0';
            if(c>max) max=c;
        }
        return max;
    }
}