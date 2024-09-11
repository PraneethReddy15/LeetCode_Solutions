class Solution {
    public double trimMean(int[] arr) {
        double avg=0;
        int n= arr.length;
        int start=(5*n)/100;
        Arrays.sort(arr);
        int sum=0;
        for(int i=start;i<n-start;i++)
        {
            sum+=arr[i];
        }
        avg=(double)sum/(n-2*start);
        return avg;
    }
}