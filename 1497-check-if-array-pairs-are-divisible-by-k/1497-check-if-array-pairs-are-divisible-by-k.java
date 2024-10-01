// class Solution {
//     public boolean canArrange(int[] arr, int k) 
//     {
//         int count=0;
//         Set<Integer> set=new HashSet<>();
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 // if(i!=j ){
//                     long sum=arr[i]+arr[j];
//                     if(sum%k==0 && !set.contains(i) && !set.contains(j))
//                     {
//                         count++;
//                         set.add(i);
//                         set.add(j);
//                     }
//                 // }
//             }
//         }
//         System.out.println(count);
//         return  count==arr.length/2;
//     }
// }
class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] remainderFreq = new int[k];
        for (int num : arr) {
            int remainder = (num % k + k) % k;
            remainderFreq[remainder]++;
        }
        for (int i = 1; i < k; i++) {
            if (remainderFreq[i] != remainderFreq[k - i]) {
                return false; 
            }
        }
        return remainderFreq[0] % 2 == 0;
    }
}
