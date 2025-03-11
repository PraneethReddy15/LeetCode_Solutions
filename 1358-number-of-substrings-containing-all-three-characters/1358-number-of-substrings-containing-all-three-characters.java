// class Solution {
//     public int numberOfSubstrings(String s) {
//         int count=0;
//         for(int i=0;i<s.length();i++)
//         {
//             StringBuilder sb = new StringBuilder();
//             for(int j=i;j<s.length();j++)
//             {
//                 sb.append(s.charAt(j)+"");
//                 if(sb.toString().contains("a") && sb.toString().contains("b") && sb.toString().contains("c") ) count++;
//             }
//         }
//         // System.out.println(set);
//         return count;
//     }
// }
class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = {0, 0, 0};  // Track counts of 'a', 'b', 'c'
        int left = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;

            // Move the left pointer until we have at least one 'a', 'b', and 'c'
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += s.length() - right; // Add all valid substrings starting from 'left'
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return result;
    }
}
