class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int count = 0; // To track the number of '1's encountered
        int operations = 0; // To track the total operations from one side

        // Left-to-right pass
        for (int i = 0; i < n; i++) {
            res[i] += operations;
            count += boxes.charAt(i) == '1' ? 1 : 0;
            operations += count;
        }

        count = 0;
        operations = 0;

        // Right-to-left pass
        for (int i = n - 1; i >= 0; i--) {
            res[i] += operations;
            count += boxes.charAt(i) == '1' ? 1 : 0;
            operations += count;
        }

        return res;
    }
}
