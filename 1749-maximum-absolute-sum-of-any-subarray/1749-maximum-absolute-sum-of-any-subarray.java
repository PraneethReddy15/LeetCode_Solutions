class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0, minSum = 0, res = 0;
        for (int num : nums) {
            maxSum = Math.max(0, maxSum + num);
            minSum = Math.min(0, minSum + num);
            res = Math.max(res, Math.max(maxSum, Math.abs(minSum)));
        }

        return res;
    }
}
