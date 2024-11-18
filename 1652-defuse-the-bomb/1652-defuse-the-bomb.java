class Solution {
    public int[] decrypt(int[] code, int k) {
        int res[]=new int[code.length];
        int x=k;
        if(k==0) return res;
        else if(k>0)
        {
            for(int i=0;i<code.length;i++)
            {
                int sum=0;
                int j=i;
                k=x;
                while(k-->0)
                {
                    if(j==code.length-1) j=-1;
                    if(j<code.length)sum+=code[j+1];
                    j++;
                }
                res[i]=sum;
            }
        }
        else if(k<0) 
        {
            k = -k;
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                int j = i;
                k = x;
                while (k++ < 0)
                {
                    if(j==0) j=code.length;
                    sum +=code[j-1];
                    j--;
                }
                res[i]=sum;
            }
        }
        return res;
    }
}