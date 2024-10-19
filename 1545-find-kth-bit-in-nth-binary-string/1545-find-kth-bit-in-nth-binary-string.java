class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        for (int i=1;i<n;i++) 
        {
            String temp = sb.toString();
            sb.append("1");
            sb.append(reverseAndInvert(temp));
        }
        // System.out.println(sb);
        return sb.charAt(k - 1);
    }

    static String reverseAndInvert(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='0') 
            {
                sb.append('1');
            } 
            else 
            {
                sb.append('0');
            }
        }
        return sb.reverse().toString();
    }
}
