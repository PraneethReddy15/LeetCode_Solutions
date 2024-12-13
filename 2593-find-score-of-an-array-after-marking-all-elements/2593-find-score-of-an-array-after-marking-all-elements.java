// class Solution {
//     public long findScore(int[] nums) {
//         long res=0;
//         if(nums.length==1) return nums[0];
//         Set<Integer> set = new HashSet<>();
//         while(set.size()!=nums.length)
//         {
//             int index=minIndex(nums,set);
//             if(!set.contains(index)){
//                 set.add(index);
//                 res+=nums[index];
//                 if(index==0){
//                     set.add(index+1);
//                 }
//                 else if(index==nums.length-1)
//                 {
//                     set.add(index-1);
//                 }
//                 else{
//                     set.add(index-1);
//                     set.add(index+1);
//                 }
                
//             }
//             // System.out.println(set);
//         }
//         return res;
//     }
//     static int minIndex(int arr[],Set<Integer> set)
//     {
//         int min=Integer.MAX_VALUE;
//         int index=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]<min && !set.contains(i))
//             {
//                 min=arr[i];
//                 index=i;
//             }
//         }
//         return index;
//     }
// }
import java.util.PriorityQueue;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public long findScore(int[] nums) {
        long res = 0;
        int n = nums.length;

        // Priority Queue to store (value, index) pairs
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0]; // Sort by value
            return a[1] - b[1]; // If values are equal, sort by index
        });

        // Add all elements with their indices to the PriorityQueue
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{nums[i], i});
        }

        // Set to track processed indices
        Set<Integer> processed = new HashSet<>();

        // Process elements in ascending order
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int value = curr[0];
            int index = curr[1];

            // Skip if already processed
            if (processed.contains(index)) continue;

            // Add current value to the result
            res += value;

            // Mark the current index and its neighbors as processed
            processed.add(index);
            if (index > 0) processed.add(index - 1);
            if (index < n - 1) processed.add(index + 1);
        }

        return res;
    }
}
