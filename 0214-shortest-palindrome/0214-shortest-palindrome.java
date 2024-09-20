class Solution {
    public String shortestPalindrome(String s) {
        String rev_s = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev_s;
        int[] lps = computeLPS(combined);
        int longestPalindromePrefix = lps[lps.length - 1];
        String toAdd = rev_s.substring(0, rev_s.length() - longestPalindromePrefix);
        return toAdd + s;
    }
    private int[] computeLPS(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int length = 0;
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
