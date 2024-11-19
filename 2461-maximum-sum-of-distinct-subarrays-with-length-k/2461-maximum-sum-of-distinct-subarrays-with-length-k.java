// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {
//         long max=0;
//         int x=k;
//         ArrayList<Integer> al = new ArrayList<>();
//         for(int i=0;i<=nums.length-x;i++){
//             long sum=0;
//             al.clear();
//             boolean flag=true;
//             for(int j=i;j<i+k;j++)
//             {
//                 if(!al.contains(nums[j]))
//                 {
//                     sum+=nums[j];
//                     al.add(nums[j]);
//                     // System.out.println(sum);
//                 } 
//                 else{
//                     flag=false;
//                     break;
//                 }
//             }
//             if(flag) max=Math.max(max,sum);
//         }
//         return max;
//     }
// }
import java.util.HashSet;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0; // To store the maximum valid subarray sum
        long currentSum = 0; // Current sum of the sliding window
        HashSet<Integer> uniqueElements = new HashSet<>(); // Track unique elements in the current window
        
        int left = 0; // Left pointer for the sliding window
        for (int right = 0; right < nums.length; right++) {
            // Expand the window
            if (!uniqueElements.add(nums[right])) { // If duplicate found, shrink the window
                while (nums[left] != nums[right]) {
                    currentSum -= nums[left];
                    uniqueElements.remove(nums[left]);
                    left++;
                }
                left++; // Skip the duplicate
            } else {
                currentSum += nums[right]; // Add the current element to the sum
            }

            // Check if the window size is `k`
            if (right - left + 1 == k) {
                max = Math.max(max, currentSum); // Update the maximum sum
                // Slide the window forward
                currentSum -= nums[left];
                uniqueElements.remove(nums[left]);
                left++;
            }
        }

        return max;
    }
}
