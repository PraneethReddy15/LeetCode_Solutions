// class Solution {
//     public long maxKelements(int[] nums, int k) {
//         long res=0;
//         Arrays.sort(nums);
//         ArrayList<Integer> al = new ArrayList<>();
//         for(int i: nums) al.add(i);
//         for(int i=nums.length-1;i>=0;i--)
//         {
//             int max=max(al);
//             res+=max;
//             al.remove(Integer.valueOf(max));
//             int x=(int)(Math.ceil((double)max/3));
//             al.add(x);
//             // System.out.println(al);
//             k--;
//             if(k==0) break;
//             if(i==0 && k!=0)
//             {
//                 i=nums.length;
//             }

//         }
//         return res;
//     }
//     public int max(ArrayList<Integer> list)
//     {
//         Collections.sort(list);
//         return list.get(list.size()-1);
//     }
// }

class Solution {
    public long maxKelements(int[] nums, int k) {
        long res = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums) {
            heap.add(i);
        }
        while (k-- > 0) {
            int max = heap.poll();
            res+=max;
            int x= (int)Math.ceil(max/3.0);
            heap.add(x);
        }
        
        return res;
    }
}
