class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left=0,right=1L * Arrays.stream(ranks).min().getAsInt() * cars * cars;
        while(left<right)
        {
            long mid=left+(right-left)/2;
            if(temp(ranks,cars,mid))
            {
               right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    static boolean temp(int[] ranks, int cars,long mid)
    {
        long sum=0;
        for(int i : ranks)
        {
            sum+=(long)Math.floor(Math.sqrt(mid/i));
            if(sum>=cars) return true;
        }
        return sum>=cars;
    }
}