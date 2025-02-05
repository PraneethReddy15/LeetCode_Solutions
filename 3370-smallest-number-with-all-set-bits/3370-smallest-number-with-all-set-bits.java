class Solution {
    public int smallestNumber(int n) {
        int max=-1;
        for(int i=n;i<Integer.MAX_VALUE;i++)
        {
            if(bits(i)) return i;   
        }
        return 0;
    }
    static boolean bits(int n)
    {
        while(n>0)
        {
            int rem=n%2;
            if(rem==0) return false;
            n/=2;
        }
        return true;
    }
}