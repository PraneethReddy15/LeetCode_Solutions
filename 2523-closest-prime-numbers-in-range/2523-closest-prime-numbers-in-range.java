class Solution {
    public int[] closestPrimes(int left, int right) {
        int arr[]= new int[2];
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        int count=0,x=0;
        for(int i=left;i<=right;i++)
        {
            if(isPrime(i)) al.add(i);
        }
        int diff=Integer.MAX_VALUE;
        int d1=0,d2=0;
        for(int i=1;i<al.size();i++)
        {
            int a= al.get(i-1);
            int b = al.get(i);
            if(Math.abs(a-b)<diff)
            {
                diff=Math.abs(a-b);
                d1=a;
                d2=b;
            }
        }
        // System.out.println(d1);
        // System.out.println(d2);
        if(d1==0 || d2==0) return new int[]{-1,-1};
        arr[0]=d1;
        arr[1]=d2;
        return arr;
    }
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
}