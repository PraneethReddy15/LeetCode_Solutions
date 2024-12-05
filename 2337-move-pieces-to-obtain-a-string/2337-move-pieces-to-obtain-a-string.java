// class Solution {
//     public boolean canChange(String start, String target) {
//         ArrayList<Integer> startL=new ArrayList<>();
//         ArrayList<Integer> startR=new ArrayList<>();
//         ArrayList<Integer> targetL=new ArrayList<>();
//         ArrayList<Integer> targetR=new ArrayList<>();
//         for(int i=0;i<start.length();i++)
//         {
//             if(start.charAt(i)=='L') startL.add(i);
//             else if(start.charAt(i)=='R') startR.add(i);
//         }
//         for(int i=0;i<target.length();i++)
//         {
//             if(target.charAt(i)=='L') targetL.add(i);
//             else if(target.charAt(i)=='R') targetR.add(i);
//         }
//         if(startL.size()!=targetL.size() || targetR.size()!=startR.size()) return false;
//         System.out.println(startL);
//         System.out.println(startR);
//         System.out.println(targetL);
//         System.out.println(targetR);
//         boolean flagL=true;
//         boolean flagR=true;
//         // if(startL.size()==0 && targetL.size()==0) flagL=false;
//         // if(startR.size()==0 && targetR.size()==0) flagR=false;
//         for(int i=0;i<startL.size();i++)
//         {
//             // if(flagL==true) break;
//             if(startL.get(i)<targetL.get(i))
//             {
//                 return false;
//             }
//         }
//         for(int i=0;i<startR.size();i++)
//         {
//             // if(flagR==true) break;
//             if(startR.get(i)>targetR.get(i))
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        int i = 0, j = 0;
        while (i < n || j < n) {
            // Skip underscores in both strings
            while (i < n && start.charAt(i) == '_') i++;
            while (j < n && target.charAt(j) == '_') j++;

            // Check if one string is exhausted while the other isn't
            if (i == n || j == n) {
                return i == j; // Both must be exhausted at the same time
            }

            // If the characters don't match, return false
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            }

            // Check movement constraints
            if (start.charAt(i) == 'L' && i < j) {
                return false; // 'L' can't move right
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false; // 'R' can't move left
            }

            // Move to the next characters
            i++;
            j++;
        }

        return true;
    }
}
