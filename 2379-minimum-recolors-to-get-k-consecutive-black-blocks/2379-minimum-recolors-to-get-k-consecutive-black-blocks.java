class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++)
        {
            int w=0,b=0;
            for(int j=i;j<blocks.length();j++)
            {
                // if(j>k+2) break;
                if(blocks.charAt(j)=='W')
                {
                    w++;
                }
                else b++;

                if(w+b==k)
                {
                    min=Math.min(w,min);
                    // System.out.println(min);
                }
            }
        }
        return min;
    }
}