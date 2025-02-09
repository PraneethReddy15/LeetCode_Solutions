// class Solution {
//     public long countBadPairs(int[] nums) {
//         long count=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 // x++;
//                 if((nums[i] - i != nums[j] - j)) count++;
//             }
//         }
//         // System.out.println(x);
//         return count;
//     }
// }

import java.util.HashMap;
import java.util.Map;
class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPairs = (long)n * (n - 1) / 2;
        Map<Integer, Long> diffCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = nums[i] - i;
            totalPairs -= diffCount.getOrDefault(diff, 0L);
            diffCount.put(diff, diffCount.getOrDefault(diff, 0L) + 1);
        }
        return totalPairs;
    }
}