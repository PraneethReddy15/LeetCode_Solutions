// class Solution {
//     public int findLengthOfShortestSubarray(int[] arr) {
//         int count=0;
//         Stack<Integer> stack = new Stack<>();
//         ArrayList<Integer> set = new ArrayList<>();
//         for(int i : arr){
//             if(!set.contains(i)) set.add(i); 
//             else count++;
//         }
//         System.out.println(set);
//         stack.add(set.get(0));
//         for(int i=1;i<set.size();i++)
//         {
//             int curr=set.get(i-1);
//             if(set.get(i)>stack.peek()) {
//                 stack.add(set.get(i));
//             }
//             else if(set.get(i)<curr){
//                 stack.pop();
//                 stack.add(set.get(i));
//             }

//         }
//         System.out.println(stack);
//         return arr.length-stack.size()+count;
//     }
// }
class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        
        // Step 1: Find the longest non-decreasing prefix
        int left = 0;
        while (left + 1 < n && arr[left] <= arr[left + 1]) {
            left++;
        }
        
        // If the entire array is already sorted
        if (left == n - 1) return 0;
        
        // Step 2: Find the longest non-decreasing suffix
        int right = n - 1;
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }
        
        // Step 3: Find the minimum length to remove by comparing prefix and suffix
        int result = Math.min(n - left - 1, right);
        
        // Step 4: Use two pointers to find the smallest middle part to remove
        int i = 0, j = right;
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                result = Math.min(result, j - i - 1);
                i++;
            } else {
                j++;
            }
        }
        
        return result;
    }
}