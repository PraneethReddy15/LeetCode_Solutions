import java.util.*;

class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];

                // If this product already exists, add 8 * its count
                if (productCount.containsKey(product)) {
                    count += 8 * productCount.get(product);
                }

                // Increment the product count
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }
        return count;
    }
}
