// class Solution {
//     public int maxWidthRamp(int[] nums) {
//         int Omax=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             int max=0;
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i]<=nums[j])
//                 {
//                     max=j-i;
//                 }
//             }
//             Omax=Math.max(max,Omax);
//         }
//         return Omax;
//     }
// }
class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        // Stack to store decreasing sequence of indices
        Stack<Integer> stack = new Stack<>();
        
        // Step 1: Build a decreasing stack (storing indices)
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }
        
        // Step 2: Traverse from the end to find the maximum width ramp
        int maxRamp = 0;
        for (int j = n - 1; j >= 0; j--) {
            // While the stack is not empty and the current number is >= the number at the index on the stack
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                maxRamp = Math.max(maxRamp, j - stack.pop());
            }
        }
        
        return maxRamp;
    }
}
