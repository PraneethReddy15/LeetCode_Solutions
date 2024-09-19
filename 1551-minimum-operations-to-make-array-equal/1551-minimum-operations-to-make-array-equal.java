// class Solution {
//     public int minOperations(int n) 
//     {
//         int max=0,Omax=0;
//         for(int i=0;i<n;i++)
//         {
//             max=-1;
//             for(int j=i+1;j<n;j++)
//             {
//                 if(i+j==n) max=i*j;
//                 if(max>Omax) Omax=max;
//             }
//         }
//         return n%2==0? Omax+1:Omax;
//     }
// }
class Solution {
    public int minOperations(int n) {
        int result=0;

        if(n%2==0){
            result=(n/2)*(n/2);
        }
        else{
            result=((n-1)/2)*((n+1)/2);
        }
        return result;
    }
}