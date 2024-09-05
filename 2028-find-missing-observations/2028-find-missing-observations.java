class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int ans[]=new int[n];
        int len = rolls.length + n;
        int Gsum=0;
        for(int i:rolls) Gsum+=i;
        int prevN=n;
        int Osum=len*mean;
        int Asum=Osum-Gsum;
        System.out.println(Asum);
        if(Asum>n*6 || Asum<n) return new int[]{};
        for(int i = 0; i < n; i++) {
            int roll = Math.min(Asum - (n - i - 1), 6);
            ans[i] = roll;
            Asum -= roll;
        }
        return ans;

    }
}