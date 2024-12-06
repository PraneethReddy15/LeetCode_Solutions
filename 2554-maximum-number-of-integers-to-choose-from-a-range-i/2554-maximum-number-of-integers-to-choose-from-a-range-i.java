class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int count=0;
        Arrays.sort(banned);
        int x=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            while (x < banned.length && banned[x] < i) 
            {
                x++;
            }
            if (x < banned.length && banned[x] == i) 
            {
                continue;
            }
            sum += i;
            if (sum <= maxSum) 
            {
                count++;
            }
            else break;
        }
        return count;
    }
}