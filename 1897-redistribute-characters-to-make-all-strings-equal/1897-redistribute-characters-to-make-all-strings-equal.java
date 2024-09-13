class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character,Integer> m = new HashMap<>();
        if(words.length==1) return true;
        for(String s:words)
        {
            for(char c:s.toCharArray()) m.put(c,m.getOrDefault(c,0)+1);
        }
        System.out.println(m);
        for(int i : m.values())
        {
            if(i%words.length!=0) return false;
        }
        return true;
    }
}