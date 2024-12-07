class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt(); // Search range: [1, max(nums)]
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canDivide(nums, mid, maxOperations)) {
                result = mid; // Update result if current mid is valid
                right = mid - 1; // Try for a smaller max size
            } else {
                left = mid + 1; // Increase the candidate size
            }
        }

        return result;
    }

    private boolean canDivide(int[] nums, int maxSize, int maxOperations) {
        int operations = 0;

        for (int num : nums) {
            if (num > maxSize) {
                operations += (num - 1) / maxSize; // Calculate operations needed for current num
            }
            if (operations > maxOperations) {
                return false; // Too many operations required
            }
        }

        return true; // Valid configuration
    }
}
