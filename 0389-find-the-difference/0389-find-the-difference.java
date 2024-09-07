// class Solution {
//     public char findTheDifference(String s, String t) {
//         if(s.isEmpty()) return t.charAt(0);
//         Map<Character,Integer> m = new HashMap<>();
//         for(char c :s.toCharArray())
//         {
//             m.put(c,m.getOrDefault(c,0)+1);
//         }
//         char ans=' ';
//         for(char c:t.toCharArray())
//         {
//             m.put(c,m.getOrDefault(c,0)-1);
//         }
//         // System.out.println(m);
//         for(Map.Entry<Character,Integer> entry:m.entrySet())
//         {
//             if(entry.getValue()==-1)
//             {
//                 ans=entry.getKey();
//                 break;
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public char findTheDifference(String s, String t) {
        char ans=' ';
        int n;
        if(s.length()<t.length()){
            n=s.length();
            ans^=t.charAt(t.length()-1);
        }
        else{
             n=t.length();
              ans^=s.charAt(s.length()-1);
        }
        for(int i=0;i<n;i++){
            ans^=s.charAt(i);
            ans^=t.charAt(i);
        }
       
        return Character.toLowerCase(ans);
    }
}