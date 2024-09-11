// class Solution {
//     public int[] replaceElements(int[] arr) {
//         if(arr.length==1) return new int[]{-1};
//         int res[]=new int[arr.length];
//         for(int i=0;i<arr.length;i++)
//         {
//             int max=-1;
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[j]>max) max=arr[j];
//             }
//             res[i]=max;
//         }
//         return res;
//     }
// }
class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[]=new int[arr.length];
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            ans[i]=max;
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return ans;
    }
}