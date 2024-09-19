class Solution {
    public String stringHash(String s, int k) {
        int len=s.length();
        List<String> al = new ArrayList<>();
        for(int i=0;i<len;i+=k)
        {
            al.add(s.substring(i,i+k));
        }
        StringBuilder res=new StringBuilder();
        for(String s1: al)
        {
            int sum=0;
            for(char c : s1.toCharArray())
            {
                sum+=(int)c-'a';
            }
            res.append((char)((sum%26)+'a'));
        }
        return res.toString();
    }
}