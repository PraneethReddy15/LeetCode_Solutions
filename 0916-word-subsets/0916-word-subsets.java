// class Solution {
//     public List<String> wordSubsets(String[] words1, String[] words2) {
//         List<String> al = new ArrayList<>();
//         Set<String> s = new HashSet<>();
//         for(int i=0;i<words1.length;i++)
//         {
//             HashMap<Character,Integer> m = new LinkedHashMap<>();
//             for(char c : words1[i].toCharArray())
//             {
//                 m.put(c,m.getOrDefault(c,0)+1);
//             }
//             int len=0;
//             int count=0;
//             for(int j=0;j<words2.length;j++)
//             {
//                 for(char x:words2[j].toCharArray())
//                 {
//                     if(words2[j].length()>words1[i].length()) return al;
//                     if(!s.contains(words2[j])){
//                         len++;
//                         if(m.containsKey(x) && m.get(x)>0)
//                         {
//                             count++;
//                             m.put(x,m.getOrDefault(x,0)-1);
//                             System.out.println(m);
//                             System.out.println("count "+ count);
//                         }
//                         else{
//                             break;
//                         }
//                     }
                    

//                 }
//                 s.add(words2[j]);
//             }
//                     System.out.println(len);
//             if(count==len)
//             {
//                 al.add(words1[i]);
//             }
//         }
//         return al;
//     }
// }

import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        // List to store the result
        List<String> result = new ArrayList<>();
        
        // Frequency array for the maximum requirements from words2
        int[] maxFreq = new int[26];
        
        // Compute the maximum frequency for each character across all words in words2
        for (String word : words2) {
            int[] freq = getFrequency(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        
        // Check each word in words1
        for (String word : words1) {
            int[] freq = getFrequency(word);
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                result.add(word);
            }
        }
        
        return result;
    }
    
    // Helper function to calculate character frequencies
    private int[] getFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
}
