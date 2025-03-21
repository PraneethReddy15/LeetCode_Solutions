public class Solution {
    public static int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int oddCount = 0, evenCount = 1;
        int currSum = 0, result = 0;
        for (int num : arr) {
            currSum += num;

            if (currSum % 2 == 0) {
                result = (result + oddCount) % MOD;
                evenCount++;
            } else {
                result = (result + evenCount) % MOD;
                oddCount++;
            }
        }

        return result%MOD;
    }
}
