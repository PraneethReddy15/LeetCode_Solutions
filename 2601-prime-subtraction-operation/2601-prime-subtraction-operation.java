// class Solution {
//     public boolean primeSubOperation(int[] nums) {
//         ArrayList<Integer> al = new ArrayList<>();
//         int arr[]=new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
//         for(int i=0;i<nums.length;i++)
//         {
//             int p=BinarySearch(arr,nums[i]);
//             if(p<nums[i])
//             {
//                 nums[i]=nums[i]-p;
//             }
//         }

//         for(int i=1;i<nums.length;i++)
//         {
//             if(nums[i-1]>nums[i])
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
//     static int BinarySearch(int arr[],int key)
//     {
//         int left = 0;
//         int right =arr.length - 1;
//         int result = 0;
//         while (left <= right) {
//             int mid = (left + right) / 2;
//             if (arr[mid] < key) {
//                 result = arr[mid];
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
        
//         return result;
//     }
// }
class Solution {
    private static boolean[] prime;
    private void seive(int n){
        if(prime == null){
            prime = new boolean[n + 1];
            Arrays.fill(prime, true);
            prime[1] = false;
            for (int p = 2; p * p <= n; p++) {
                if (prime[p] == true) {
                    for (int i = p * p; i <= n; i += p)
                        prime[i] = false;
                }
            }
        }
    }
    public boolean primeSubOperation(int[] nums) {
        seive(1000);
        int j = 0, smallestTillNow = 1;
        
        while(j < nums.length){
            int diff = nums[j] - smallestTillNow;
            if(diff < 0){
                return false;
            }

            if(prime[diff] || diff == 0){
                smallestTillNow++;
                j++;
            }else{
                smallestTillNow++;
            }
        }
        return true;
    }
}
