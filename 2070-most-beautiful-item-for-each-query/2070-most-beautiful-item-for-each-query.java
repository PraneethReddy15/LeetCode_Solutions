// class Solution {
//     public int[] maximumBeauty(int[][] items, int[] queries) {
//         Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
//         // System.out.println(Arrays.deepToString(items));
//         Map<Integer,Integer> m = new TreeMap<>();
//         for(int i=0;i<items.length;i++)
//         {
//             m.put(items[i][0],items[i][1]);
//         }
//         System.out.println(m);
//         int res[]=new int[queries.length];
//         for(int i=0;i<queries.length;i++)
//         {
//             int maxKey=0,Omax=0;
//             for(Map.Entry<Integer,Integer> entry:m.entrySet())
//             {
//                 if(entry.getKey()<=queries[i])
//                 {
//                     maxKey=entry.getValue();
//                     Omax=Math.max(Omax,maxKey);
//                 }
//                 else break;
//             }
//             res[i]=Omax;

//         }
//         return res;
//     }
// }
class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        Map<Integer, Integer> m = new TreeMap<>();
        int max = 0;
        for (int i = 0; i < items.length; i++) {
            max = Math.max(max, items[i][1]);
            m.put(items[i][0], max);
        }

        int res[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int Omax = 0;
            Integer key = ((TreeMap<Integer, Integer>) m).floorKey(queries[i]);
            if (key != null) {
                Omax = m.get(key);
            }
            res[i] = Omax;
        }
        
        return res;
    }
}
