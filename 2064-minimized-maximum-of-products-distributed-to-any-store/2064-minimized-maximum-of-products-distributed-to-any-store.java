class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int totalItems = 0;
        for (int quantity : quantities) {
            totalItems += quantity;
        }
        int left = 1, right = Arrays.stream(quantities).max().getAsInt();
        int result = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(mid, n, quantities)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
    
    private boolean canDistribute(int maxLoad, int n, int[] quantities) {
        int requiredBins = 0;
        for (int quantity : quantities) {
            requiredBins += (quantity + maxLoad - 1) / maxLoad;
        }
        return requiredBins <= n;  
    }
}