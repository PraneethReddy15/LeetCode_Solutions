import java.util.*;

class Solution {
    public int minCapability(int[] nums, int k) {
        int start = Arrays.stream(nums).min().getAsInt(); // Minimum house value
        int end = Arrays.stream(nums).max().getAsInt();   // Maximum house value
        
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (canSteal(nums, k, mid)) {
                end = mid;  // Try to minimize capability
            } else {
                start = mid + 1;  // Increase capability
            }
        }

        return start;
    }

    // Greedy function to check if the robber can steal at least k houses
    private boolean canSteal(int[] nums, int k, int capability) {
        int count = 0;  // Tracks number of houses stolen
        int index = 0;

        while (index < nums.length) {
            if (nums[index] <= capability) {
                count++;
                if (count >= k) return true; // Early exit if condition met
                index += 2;  // Skip the next house to maintain non-adjacency
            } else {
                index++; // Move to the next house
            }
        }

        return false;
    }
}
