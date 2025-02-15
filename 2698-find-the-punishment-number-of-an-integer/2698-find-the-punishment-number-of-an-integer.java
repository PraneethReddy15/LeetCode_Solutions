class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (isValid(i)) {
                sum += (i * i);
            }
        }
        return sum;
    }

    static boolean isValid(int n) 
    {
        int squared = n * n;
        return canPartition(String.valueOf(squared), 0, n);
    }
    static boolean canPartition(String numStr, int start, int target) 
    {
        if (start == numStr.length()) return target == 0;
        int num = 0;
        for (int i = start; i < numStr.length(); i++) 
        {
            num = num * 10 + (numStr.charAt(i) - '0');
            if (num > target) break; 
            if (canPartition(numStr, i + 1, target - num)) return true;
        }
        return false;
    }
}
