// class Solution {
//     public int pivotInteger(int n) {
//         int pivot=-1;
//         int sum1=0;
//         if(n==1) return 1;
//         for(int i=1;i<n;i++)
//         {
//             int sum2=0;
//             sum1+=i;
//             for(int j=i;j<=n;j++)
//             {
//                 sum2+=j;
//             }
//             if(sum1==sum2) return i;
//         }
//         return pivot;
//     }
// }

class Solution {
    public int pivotInteger(int n) {
        int total = n*(n+1)/2;
        for(int i=1;i<=n;i++){
            if(i*(i+1)/2 == total - (i-1)*i/2){
                return i;
            }
        }
        return -1;
    }
}