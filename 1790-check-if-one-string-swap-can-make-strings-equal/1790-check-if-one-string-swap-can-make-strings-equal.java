class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        Map<Character,Integer> m = new HashMap<>();
        for(char c : s1.toCharArray()) m.put(c,m.getOrDefault(c,0)+1);
        Map<Character,Integer> m2 = new HashMap<>();
        for(char c : s2.toCharArray()){
            if(!m.containsKey(c)) return false;
            m2.put(c,m2.getOrDefault(c,0)+1);
        }
        for(char c : s1.toCharArray())
        {
            if(m.get(c)!=m2.get(c)) return false;
        }
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s2.charAt(i)!=s1.charAt(i)) count++;
            if(count>2) return false;
        }
        // System.out.println(Arrays.toString(arr));
        return true;
    }
}