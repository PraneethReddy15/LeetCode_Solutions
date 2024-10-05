// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         if(s1.length()>s2.length()) return false;
//         char ch1[]=s1.toCharArray();
//         Arrays.sort(ch1);
//         StringBuilder temp=new StringBuilder();
//         for(char c: ch1) temp.append(c);
//         int len=s1.length();
//         boolean flag=false;
//         Set<String> al=new HashSet<>();
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<s2.length();i++)
//         {
//             int count=0;
//             for(int j=i;j<s2.length();j++){
//                 count++;
//                 sb.append(s2.charAt(j));
//                 if(count%len==0) break;
//             }
//             al.add(sb.toString());
//             if(al.contains(s1)) return true;
//             sb.setLength(0);
//         }
//         for(String s:al)
//         {
//             char ch[]=s.toCharArray();
//             Arrays.sort(ch);
//             StringBuilder sb1=new StringBuilder();
//             for(char c:ch) sb1.append(c);
//             if(sb1.toString().equals(temp.toString())) return true;
//         }
//         return false;
//     }
// }
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for (int i = 0; i < len1; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len2 - len1; i++) {
            if (matches(s1Count, s2Count)) return true;
            s2Count[s2.charAt(i) - 'a']--;
            s2Count[s2.charAt(i + len1) - 'a']++;
        }
        return matches(s1Count, s2Count);
    }
    static boolean matches(int[] s1Count, int[] s2Count) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != s2Count[i]) return false;
        }
        return true;
    }
}
