// class Solution {
//     public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
//         int res[]=new int[queries.length];
//         Map<Integer,Integer> m = new HashMap<>();
//         int y=1;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==x){
//                 m.put(i,y);
//                 y++;
//             }
//         }
//         if(m.size()==0)
//         {
//             Arrays.fill(res,-1);
//             return res;
//         }
//         for(int i=0;i<queries.length;i++)
//         {
//             int z=-1;
//             for(Map.Entry<Integer,Integer> entry : m.entrySet())
//             {
//                 if(queries[i]==entry.getValue() && z<res.length)
//                 {
//                     z=entry.getKey();
//                     break;
//                 }
//             }
//             res[i]=z;
//         }
//         // System.out.println(m);
//         return res;
//     }
// }

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                positions.add(i);
            }
        }
        if (positions.isEmpty()) {
            int[] res = new int[queries.length];
            Arrays.fill(res, -1);
            return res;
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] > positions.size() || queries[i] <= 0) {
                res[i] = -1;
            } else {
                res[i] = positions.get(queries[i] - 1);
            }
        }
        return res;
    }
}