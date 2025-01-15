class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int res[]=new int[A.length];
        int z=0;
        for(int i=0;i<A.length;i++)
        {
            int count=0;
            ArrayList<Integer> al = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                al.add(A[j]);
            }
            for(int x=0;x<al.size();x++)
            {
                if(al.contains(B[x])){
                    count++;
                }
            }
            if(z<A.length) res[z++]=count;
        }
        return res;
    }
}