class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        Map<Character,Integer> m = new HashMap<>();
        for(char c:s.toCharArray())
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int oddCount=0;
        for(int i : m.values())
        {
            if(i%2!=0) oddCount++;
        }
        if(oddCount > k ) return false;
        return true;
    }
}